package com.sparkling18.rest.client.server.filter;

import java.security.*;
import com.sun.jersey.api.client.filter.ClientFilter;
import com.sun.jersey.api.client.*;
import java.nio.charset.Charset;
import java.io.*;
import javax.crypto.*;
import java.util.*;
import com.sparkling18.rest.client.server.util.*;
import org.apache.commons.lang3.StringUtils;

public class Spk18SignatureFilter extends ClientFilter {
    private String keyId;
    private PrivateKey privateKey;
    private PublicKey serverPublicKey;

    public Spk18SignatureFilter(String keyId, PrivateKey privateKey, PublicKey serverPublicKey) {
        this.keyId = keyId;
        this.privateKey = privateKey;
        this.serverPublicKey = serverPublicKey;
    }

    @Override
    public ClientResponse handle(ClientRequest req) {
        String bodyString = (String) req.getEntity();
        String bodyResponseString = null;
        ClientResponse resp = null;

        try {
            if(StringUtils.isEmpty(bodyString)) {
                bodyString = "";
            }

            byte[] body = bodyString.getBytes(Charset.forName(SignatureUtils.CHARSET));
            String requestLine = SignatureUtils.extractRequestLine(req);
            String date = SignatureUtils.extractCurrentDate();
            String hostName = req.getURI().toURL().getHost() + (req.getURI().toURL().getPort() < 0 || req.getURI().toURL().getPort() == 80? "" : ":" + req.getURI().toURL().getPort());

            SecretKey secretKey = SignatureUtils.generateRandomSecretKey();
            byte[] cryptedKey = Base64Codec.encode(SignatureUtils.encryptAsymmetric(serverPublicKey, secretKey.getEncoded()));
            String cryptedKeyString = new String(cryptedKey, "UTF8");

            body = Base64Codec.encode(SignatureUtils.encryptSymmetric(secretKey, body));

            String headersSigningPart = SignatureUtils.composeHeadersOld(requestLine, date, hostName, body.length + "", cryptedKeyString);
            String headersPart = SignatureUtils.composeHeaders();

            String signature = SignatureUtils.sign(privateKey, headersSigningPart);

            String authorizationHeader = SignatureUtils.composeAuthorization(keyId, headersPart, signature);

            req.getHeaders().putSingle(SignatureUtils.HEADER_AUTHORIZATION, authorizationHeader);
            req.getHeaders().putSingle(SignatureUtils.PARAM_DATE, date);
            req.getHeaders().putSingle(SignatureUtils.PARAM_KEY, cryptedKeyString);

            if(body.length == 0) {
                req.setEntity(null);
            }
            else {
                req.setEntity(new String(body, Charset.forName(SignatureUtils.CHARSET)));
            }

            req.getHeaders().putSingle(SignatureUtils.PARAM_CONTENT_LENGTH, body.length + "");

            resp = getNext().handle(req);

            bodyResponseString = (String) resp.getEntity(String.class);
            String authorizationResp = SignatureUtils.extractAuthorizationPart(resp);
            Map<String, String> headerParamsResp = SignatureUtils.extractHeaderExpectedParameters(authorizationResp);
            String keyIdResp = headerParamsResp.get(SignatureUtils.PARAM_KEY_ID);
            String signatureResp = headerParamsResp.get(SignatureUtils.PARAM_SIGNATURE);

            Map<String, String> requestParamResp = SignatureUtils.extractHeaderExpectedParameters(resp, req.getMethod(), req.getURI());
            String headersPartResp = SignatureUtils.extractPartToSign(requestParamResp);

            if(!keyId.equals(keyIdResp)) {
                throw new SecurityException("keyId mismatch");
            }

            boolean worksFine = SignatureUtils.verify(serverPublicKey, headersPartResp, signatureResp);

            if(!worksFine) {
                throw new SecurityException("Server Signature invalid");
            }

            String keyResp = requestParamResp.get(SignatureUtils.PARAM_KEY);
            byte[] decryptedSymmetricKey = SignatureUtils.decryptAsymmetric(privateKey, Base64Codec.decode(keyResp.getBytes(Charset.forName(SignatureUtils.CHARSET))));
            SecretKey symmetricKeyResp = SignatureUtils.getSecretKeyFromByte(decryptedSymmetricKey);

            if(!StringUtils.isEmpty(bodyResponseString)) {
                byte[] decryptedBody = null;
                decryptedBody = SignatureUtils.decryptSymmetric(symmetricKeyResp, Base64Codec.decode(bodyResponseString.getBytes(Charset.forName(SignatureUtils.CHARSET))));
                resp.setEntityInputStream(new ByteArrayInputStream(decryptedBody));
            }

            return resp;
        } catch(SecurityException se) {
            throw se;
        }
        catch(Exception e) {
            if(resp != null) {
                resp.setEntityInputStream(new ByteArrayInputStream(bodyResponseString.getBytes(Charset.forName(SignatureUtils.CHARSET))));
            }
            return resp;
        }
    }

    private byte[] streamToBytes(InputStream is) throws IOException {
        byte[] buf;
        int len;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        buf = new byte[1024];

        while ((len = is.read(buf, 0, 1024)) != -1) {
            bos.write(buf, 0, len);
        }

        buf = bos.toByteArray();
        return buf;
    }
}