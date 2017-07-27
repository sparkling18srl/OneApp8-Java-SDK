package com.sparkling18.rest.client.server.util;

import javax.crypto.*;
import javax.crypto.spec.*;
import java.io.*;
import java.net.URI;
import java.security.*;
import java.security.spec.*;
import java.text.SimpleDateFormat;
import java.util.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.codec.binary.*;
import javax.ws.rs.core.*;
import com.sun.jersey.api.client.*;

public class SignatureUtils {
    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String PARAM_SIGNATURE_AUTH = "Signature";
    public static final String PARAM_HEADERS = "headers";
    public static final String PARAM_SIGNATURE = "signature";
    public static final String PARAM_REQUEST_LINE = "(request-line)";
    public static final String PARAM_HOST = "host";
    public static final String PARAM_DATE = "sign-date";
    public static final String PARAM_CONTENT_LENGTH = "content-length";
    public static final String PARAM_KEY_ID = "keyId";
    public static final String PARAM_KEY = "key";
    public static final String PARAM_ALGORITHM = "algorithm";
    public static final String VALUE_PARAM_ALGORITHM = "rsa-sha256";
    public static final String VALUE_PARAM_METHOD = "GET";
    public static final String CHARSET = "UTF-8";

    public static final String DATE_PATTERN = "EEE, dd MMM yyyy HH:mm:ss zzz";
    public static final String SIGN_CHARSET = "UTF8";
    public static final String SIGN_ALGORITHM = "SHA256withRSA";

    private static final String ENCRYPT_ASYMMETRIC_ALGORITHM = "RSA";
    private static final String ENCRYPT_ASYMMETRIC_MODE = "ECB";
    private static final String ENCRYPT_ASYMMETRIC_PADDING = "PKCS1Padding";

    public static final String ENCRYPT_ASYMMETRIC_CIPHER_TRANSFORMATION = ENCRYPT_ASYMMETRIC_ALGORITHM + "/" + ENCRYPT_ASYMMETRIC_MODE + "/"
    + ENCRYPT_ASYMMETRIC_PADDING;

    private static final int ENCRYPT_SYMMETRIC_KEY_SIZE = 128;
    private static final String ENCRYPT_SYMMETRIC_ALGORITHM = "AES";
    private static final String ENCRYPT_SYMMETRIC_MODE = "CTR";
    private static final String ENCRYPT_SYMMETRIC_PADDING = "NoPadding";

    public static final String ENCRYPT_SYMMETRIC_CIPHER_TRANSFORMATION = ENCRYPT_SYMMETRIC_ALGORITHM + "/" + ENCRYPT_SYMMETRIC_MODE + "/" + ENCRYPT_SYMMETRIC_PADDING;

    private static final IvParameterSpec KEY_SPEC = new IvParameterSpec(new byte[] { 4, 3, 7, 5, 55, 3, 33, 2, 5, 1, 6, 2, 8, 8, 3, 0 });

    private SignatureUtils() {
    // do nothing : utility class
    }

    public static String composeHeadersOld(String requestLine, String date, String host, String contentLength, String key) {
        StringBuffer headersBuffer = new StringBuffer();

        headersBuffer.append(SignatureUtils.PARAM_REQUEST_LINE + ": " + normalizeRequestLineURL(requestLine) + "\n");
        headersBuffer.append(SignatureUtils.PARAM_HOST + ": " + host + "\n");
        headersBuffer.append(SignatureUtils.PARAM_DATE + ": " + date + "\n");
        headersBuffer.append(SignatureUtils.PARAM_CONTENT_LENGTH + ": " + contentLength + "\n");
        headersBuffer.append(SignatureUtils.PARAM_KEY + ": " + key);

        return headersBuffer.toString();
    }

    public static String composeHeaders() {
        StringBuffer headersBuffer = new StringBuffer();

        headersBuffer.append(SignatureUtils.PARAM_REQUEST_LINE);
        headersBuffer.append(" ");
        headersBuffer.append(SignatureUtils.PARAM_HOST);
        headersBuffer.append(" ");
        headersBuffer.append(SignatureUtils.PARAM_DATE);
        headersBuffer.append(" ");
        headersBuffer.append(SignatureUtils.PARAM_CONTENT_LENGTH);
        headersBuffer.append(" ");
        headersBuffer.append(SignatureUtils.PARAM_KEY);

        return headersBuffer.toString();
    }

    public static String composeAuthorization(String keyId, String headers, String signature) {
        StringBuffer signatureBuffer = new StringBuffer();

        signatureBuffer.append(SignatureUtils.PARAM_SIGNATURE_AUTH + " ");
        signatureBuffer.append(SignatureUtils.PARAM_KEY_ID + "=\"" + keyId + "\"");
        signatureBuffer.append(", ");
        signatureBuffer.append(SignatureUtils.PARAM_ALGORITHM + "=\"" + SignatureUtils.VALUE_PARAM_ALGORITHM + "\"");
        signatureBuffer.append(", ");
        signatureBuffer.append(SignatureUtils.PARAM_HEADERS + "=\"" + headers + "\"");
        signatureBuffer.append(", ");
        signatureBuffer.append(SignatureUtils.PARAM_SIGNATURE + "=\"" + signature + "\"");

        return signatureBuffer.toString();
    }

    public static String extractAuthorizationPart(ClientResponse response) throws Exception {
        List<String> authorization = response.getHeaders().get(SignatureUtils.HEADER_AUTHORIZATION);

        if (authorization == null || authorization.isEmpty()) {
            throw new Exception("No header : " + HEADER_AUTHORIZATION + " found in response header");
        }

        return authorization.get(0);
    }

    public static String extractPartToSign(Map<String, String> content) throws Exception {
        StringBuffer bufferToSign = new StringBuffer();
    
        String requestLine = content.get(PARAM_REQUEST_LINE);
        if (StringUtils.isEmpty(requestLine)) {
           throw new Exception("No param : " + PARAM_REQUEST_LINE + " found in request header");
        }
        bufferToSign.append(PARAM_REQUEST_LINE + ": " + requestLine + "\n");
    
        String host = content.get(PARAM_HOST);
        if (StringUtils.isEmpty(host)) {
            throw new Exception("No param : " + PARAM_HOST + " found in request header");
        }
        bufferToSign.append(PARAM_HOST + ": " + host + "\n");
    
        String date = content.get(PARAM_DATE);
        if (StringUtils.isEmpty(date)) {
            throw new Exception("No param : " + PARAM_DATE + " found in request header");
        }
        bufferToSign.append(PARAM_DATE + ": " + date + "\n");
    
        String contentLength = content.get(PARAM_CONTENT_LENGTH);
        if (StringUtils.isEmpty(contentLength)) {
            throw new Exception("No param : " + PARAM_CONTENT_LENGTH + " found in request header");
        }
        bufferToSign.append(PARAM_CONTENT_LENGTH + ": " + contentLength + "\n");
    
        String key = content.get(PARAM_KEY);
        if (StringUtils.isEmpty(key)) {
            throw new Exception("No param : " + PARAM_KEY + " found in request header");
        }
        bufferToSign.append(PARAM_KEY + ": " + key);

        return bufferToSign.toString();
    }

    public static String sign(PrivateKey privateKey, String toSign) throws Exception {
        byte[] sign = sign(privateKey, String.valueOf(toSign).getBytes(SIGN_CHARSET));
        return new String(Base64Codec.encode(sign));
    }

    public static boolean verify(PublicKey publicKey, String signedContent, String signature) throws Exception {
        return verify(publicKey, String.valueOf(signedContent).getBytes(SIGN_CHARSET), Base64Codec.decode(signature.getBytes(SIGN_CHARSET)));
    }

    private static String extractParam(String sourceString, String toSearch) throws Exception {
        int indexOfKey = sourceString.indexOf(toSearch + "=");

        if (indexOfKey < 0) {
            throw new Exception(sourceString + " not found");
        }
        
        int indexOfKeyValueStart = sourceString.indexOf('"', indexOfKey);
        int indexOfKeyValueEnd = sourceString.indexOf('"', indexOfKeyValueStart + 1);
        String keyValue = sourceString.substring(indexOfKeyValueStart + 1, indexOfKeyValueEnd);
        return keyValue;
    }

    public static Map<String, String> extractHeaderExpectedParameters(ClientResponse response, String requestMethod, URI uri) throws Exception {
        Map<String, String> headerMap = new HashMap<String, String>();
        MultivaluedMap<String,String> headers = response.getHeaders();

        String requestLine = requestMethod.toLowerCase() + " " + uri.getPath().toLowerCase();
        requestLine = normalizeRequestLineURL(requestLine);
        headerMap.put(PARAM_REQUEST_LINE, requestLine);

        List<String> hostList = headers.get(SignatureUtils.PARAM_HOST);
        if (hostList == null || hostList.isEmpty()) {
            throw new Exception("No param : " + SignatureUtils.PARAM_HOST + " found in request header");
        }
        headerMap.put(SignatureUtils.PARAM_HOST, hostList.get(0));

        List<String> dateList = headers.get(SignatureUtils.PARAM_DATE);
        if (dateList == null || dateList.isEmpty()) {
            throw new Exception("No param : " + SignatureUtils.PARAM_DATE + " found in request header");
        }
        headerMap.put(SignatureUtils.PARAM_DATE, dateList.get(0));

        List<String> contentLengthList = headers.get(SignatureUtils.PARAM_CONTENT_LENGTH);
        if ((contentLengthList == null || contentLengthList.isEmpty())) {
            if(VALUE_PARAM_METHOD.equals(requestMethod.toUpperCase())) {
                contentLengthList = new ArrayList<String>();
                contentLengthList.add("0");
            }
            else {
                throw new Exception("No param : " + SignatureUtils.PARAM_CONTENT_LENGTH + " found in request header");
            }
        }
        headerMap.put(SignatureUtils.PARAM_CONTENT_LENGTH, contentLengthList.get(0));

        List<String> keyList = headers.get(SignatureUtils.PARAM_KEY);
        if (keyList == null || keyList.isEmpty()) {
            throw new Exception("No param : " + SignatureUtils.PARAM_KEY + " found in request header");
        }
        headerMap.put(SignatureUtils.PARAM_KEY, keyList.get(0));

        return headerMap;
    }

    public static Map<String, String> extractHeaderExpectedParameters(String authorization) throws Exception {
        Map<String, String> headerMap = new HashMap<String, String>();
    
        // Key Id
        if (StringUtils.isEmpty(authorization)) {
            throw new Exception("Header : " + HEADER_AUTHORIZATION + " not found in request header");
        }
    
        String keyIdValue = extractParam(authorization, PARAM_KEY_ID);
        if (StringUtils.isEmpty(keyIdValue)) {
            throw new Exception("No param : " + PARAM_KEY_ID + " found in request header");
        }
        headerMap.put(PARAM_KEY_ID, keyIdValue);
    
        String algorithm = extractParam(authorization, PARAM_ALGORITHM);
        if (StringUtils.isEmpty(algorithm)) {
            throw new Exception("No param : " + PARAM_ALGORITHM + " found in request header");
        }
        headerMap.put(PARAM_ALGORITHM, algorithm);
    
        String headers = extractParam(authorization, PARAM_HEADERS);
        if (StringUtils.isEmpty(headers)) {
            throw new Exception("No param : " + PARAM_HEADERS + " found in request header");
        }
        headerMap.put(PARAM_HEADERS, headers);
    
        String signature = extractParam(authorization, PARAM_SIGNATURE);
        if (StringUtils.isEmpty(signature)) {
            throw new Exception("No param : " + PARAM_SIGNATURE + " found in request header");
        }
        headerMap.put(PARAM_SIGNATURE, signature);
    
        return headerMap;
    }

    public static String extractRequestLine(ClientRequest request) {
        String requestLine = request.getMethod().toString().toLowerCase() + " " + request.getURI().getPath().toLowerCase();
        return normalizeRequestLineURL(requestLine);
    }

    private static String normalizeRequestLineURL(String requestLine) {
        if (requestLine.contains("/ppt-restapi")) {
            requestLine = requestLine.replace("/ppt-restapi", "");
        }
        return requestLine;
    }

    public static String extractCurrentDate() {
        return extractCurrentDate(new Date());
    }

    public static String extractCurrentDate(Date now) {
        SimpleDateFormat format = new SimpleDateFormat(DATE_PATTERN, Locale.ENGLISH);
        format.setTimeZone(TimeZone.getTimeZone("GMT"));
        return format.format(now);
    }

    public static String convertDateForHeaderPurpose(Date date) {
        SimpleDateFormat format = new SimpleDateFormat(DATE_PATTERN, Locale.ENGLISH);
        format.setTimeZone(TimeZone.getTimeZone("GMT"));
        return format.format(date);
    }

    public  PrivateKey getRsaPrivateKeyFromFile(String filename) throws Exception {
        File f = new File(filename);
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        byte[] keyBytes = new byte[(int) f.length()];
        dis.readFully(keyBytes);
        dis.close();

        String temp = new String(keyBytes);
        String privKeyPEM = temp.replace("-----BEGIN PRIVATE KEY-----\n", "");
        privKeyPEM = privKeyPEM.replace("-----END PRIVATE KEY-----", "");
        //System.out.println("Private key\n"+privKeyPEM);

        Base64 b64 = new Base64();
        byte [] decoded = b64.decode(privKeyPEM);

        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(decoded);
        KeyFactory kf = KeyFactory.getInstance(ENCRYPT_ASYMMETRIC_ALGORITHM);
        return kf.generatePrivate(spec);
    }

    public  PublicKey getRsaPublicKeyFromFile(String filename) throws Exception {
        File f = new File(filename);
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        byte[] keyBytes = new byte[(int) f.length()];
        dis.readFully(keyBytes);
        dis.close();

        String temp = new String(keyBytes);
        String publicKeyPEM = temp.replace("-----BEGIN PUBLIC KEY-----\n", "");
        publicKeyPEM = temp.replace("-----END PUBLIC KEY-----", "");


        Base64 b64 = new Base64();
        byte [] decoded = b64.decode(publicKeyPEM);

        X509EncodedKeySpec spec =
        new X509EncodedKeySpec(decoded);
        KeyFactory kf = KeyFactory.getInstance(ENCRYPT_ASYMMETRIC_ALGORITHM);
        return kf.generatePublic(spec);
    }

    private static byte[] sign(PrivateKey privateKey, byte[] content) throws Exception {
        Signature signature = Signature.getInstance(SIGN_ALGORITHM);
        signature.initSign(privateKey);
        signature.update(content);
        byte[] signatureBytes = signature.sign();
        return signatureBytes;
    }

    private static boolean verify(PublicKey publicKey, byte[] data, byte[] signature) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance(ENCRYPT_ASYMMETRIC_ALGORITHM);
        Signature sig = Signature.getInstance(SIGN_ALGORITHM);
        sig.initVerify(publicKey);
        sig.update(data);
        return sig.verify(signature);
    }

    public static byte[] encryptAsymmetric(PublicKey publicKey, byte[] data) throws Exception {
        byte[] encryptedData = null;

        Cipher cipher;
        cipher = Cipher.getInstance(ENCRYPT_ASYMMETRIC_CIPHER_TRANSFORMATION);
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        encryptedData = cipher.doFinal(data);

        return encryptedData;
    }

    public static byte[] encryptSymmetric(SecretKey secretKey, byte[] data) throws Exception {
        byte[] encryptedData = null;

        Cipher cipher;
        cipher = Cipher.getInstance(ENCRYPT_SYMMETRIC_CIPHER_TRANSFORMATION);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, KEY_SPEC);
        encryptedData = cipher.doFinal(data);

        return encryptedData;
    }

    public static byte[] decryptSymmetric(SecretKey secretKey, byte[] encrypedData) throws Exception {
        byte[] data = null;

        Cipher cipher;
        cipher = Cipher.getInstance(ENCRYPT_SYMMETRIC_CIPHER_TRANSFORMATION);
        cipher.init(Cipher.DECRYPT_MODE, secretKey, KEY_SPEC);
        data = cipher.doFinal(encrypedData);

        return data;
    }

    public static byte[] decryptAsymmetric(PrivateKey privateKey, byte[] encrypedData) throws Exception {
        byte[] data = null;

        Cipher cipher;
        cipher = Cipher.getInstance(ENCRYPT_ASYMMETRIC_CIPHER_TRANSFORMATION);
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        data = cipher.doFinal(encrypedData);

        return data;
    }

    public static SecretKey generateRandomSecretKey() throws Exception {
        SecureRandom random = new SecureRandom();
        return createKeyForAES(ENCRYPT_SYMMETRIC_KEY_SIZE, random);
    }

    private static SecretKey createKeyForAES(int bitLength, SecureRandom random) throws NoSuchAlgorithmException, NoSuchProviderException {
        KeyGenerator generator = KeyGenerator.getInstance(ENCRYPT_SYMMETRIC_ALGORITHM);
        generator.init(bitLength, random);
        return generator.generateKey();
    }

    public static SecretKey getSecretKeyFromByte(byte[] data) {
        SecretKey key = new SecretKeySpec(data, 0, data.length, ENCRYPT_SYMMETRIC_ALGORITHM);
        return key;
    }
}