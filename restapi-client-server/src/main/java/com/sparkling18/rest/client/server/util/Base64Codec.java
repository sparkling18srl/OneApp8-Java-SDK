package com.sparkling18.rest.client.server.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.BaseNCodec;

import java.io.UnsupportedEncodingException;

/**
* Supported variants:
* - Base64Variant.STRICT (RFC 4648, ch 4) encoding and decoding
* - Base64Variant.URL (RFC 4648, ch 5) encoding
*
* @author OANCEA
*
*/
public final class Base64Codec {

    /**
    * @author OANCEA
    *
    */
    public enum Base64Variant {
    /**
    * RFC 4648, section 4
    */
    STRICT,
    /**
    * RFC 4648, section 4 with CHUNK_SIZE = 76 and CRLF = <code>"\r\n"</code>
    */
    MIME,
    /**
    * RFC 4648, section 5
    */
    URL,
    /**
    * RFC 4648, section 4 with CHUNK_SIZE = 64 and CRLF = <code>"\r\n"</code>
    */
    PEM;
    }

    private final static BaseNCodec BASE_64_URL = new Base64(0, null, true);

    private static BaseNCodec BASE_64_PEM;

    private static BaseNCodec BASE_64_MIME;

    static {
    try {
    BASE_64_PEM = new Base64(BaseNCodec.PEM_CHUNK_SIZE, "\r\n".getBytes("UTF-8"), false);
    BASE_64_MIME = new Base64(BaseNCodec.MIME_CHUNK_SIZE, "\r\n".getBytes("UTF-8"), false);

    } catch (UnsupportedEncodingException e) {
        throw new ExceptionInInitializerError(e);
    }

    }

    /**
    * Costruttore di default.
    */
    private Base64Codec() {
        super();
    }

    /**
    * Using variant: <code>Base64Variant.STRICT</code>
    *
    * @param binaryData
    * @return
    */
    public final static byte[] encode(byte binaryData[]) {
        return Base64Codec.encode(binaryData, Base64Variant.STRICT);
    }

    /**
    * Using variant: <code>Base64Variant.STRICT</code>
    *
    * @param base64Data
    * @return
    */
    public final static byte[] decode(byte base64Data[]) {
        return Base64Codec.decode(base64Data, Base64Variant.STRICT);
    }

    /**
    * @param binaryData
    * @return
    */
    public final static byte[] encode(byte binaryData[], Base64Variant variant) {
        switch (variant) {
            case STRICT:
            return Base64Strict.encode(binaryData);
            case URL:
            return Base64Codec.BASE_64_URL.encode(binaryData);
            case PEM:
            return Base64Codec.BASE_64_PEM.encode(binaryData);
            case MIME:
            return Base64Codec.BASE_64_MIME.encode(binaryData);
            default:
            throw new RuntimeException("Unsupported encoding for Base 64 Variant.");
        }
    }

    /**
    * @param base64Data
    * @return
    */
    public final static byte[] decode(byte base64Data[], Base64Variant variant) {
        switch (variant) {
            case STRICT:
            return Base64Strict.decode(base64Data);
            case URL:
            return Base64Codec.BASE_64_URL.decode(base64Data);
            case PEM:
            return Base64Codec.BASE_64_PEM.decode(base64Data);
            case MIME:
            return Base64Codec.BASE_64_MIME.decode(base64Data);
            default:
            throw new RuntimeException("Unsupported decoding Base 64 Variant.");
        }
    }

}
