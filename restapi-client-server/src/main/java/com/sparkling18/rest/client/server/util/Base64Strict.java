package com.sparkling18.rest.client.server.util;

import java.io.UnsupportedEncodingException;

/**
FunzionalitÃ  di Encodig e Decondig di Array di Byte in formato
Base64Strict.
*/
public class Base64Strict
{
    private static final int BASELENGTH = 255;
    private static final int LOOKUPLENGTH = 64;
    private static final int TWENTYFOURBITGROUP = 24;
    private static final int EIGHTBIT = 8;
    private static final int SIXTEENBIT = 16;
    private static final int FOURBYTE = 4;
    private static final byte PAD = 61;

    private static byte Base64Alphabet[] = null;
    private static byte LookUpBase64Alphabet[] = null;

    /**
    * Costruttore di default.
    */
    public Base64Strict()
    {
        super();
    }

    /***
    * Decodifica di un Array du Byte in formato Base64.
    * <p><p>
    * @param base64Data Array di Byte in in formato Base64.
    * <p><p>
    * @return Array di Byte decodificato.
    */
    public static byte[] decode(byte base64Data[])
    {
        int numberQuadruple = base64Data.length / Base64Strict.FOURBYTE;
        byte decodedData[] = (byte[]) null;
        byte b1 = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte marker0 = 0;
        byte marker1 = 0;
        int encodedIndex = 0;
        int dataIndex = 0;
        int pads = 0;
        decodedData = new byte[numberQuadruple * 3 + 1];
        for (int i = 0; i < numberQuadruple; i++)
        {
            dataIndex = i * Base64Strict.FOURBYTE;
            marker0 = base64Data[dataIndex + 2];
            marker1 = base64Data[dataIndex + 3];
            b1 = Base64Strict.Base64Alphabet[base64Data[dataIndex]];
            b2 = Base64Strict.Base64Alphabet[base64Data[dataIndex + 1]];
            if (marker0 != Base64Strict.PAD && marker1 != Base64Strict.PAD)
            {
                b3 = Base64Strict.Base64Alphabet[marker0];
                b4 = Base64Strict.Base64Alphabet[marker1];
                decodedData[encodedIndex] = (byte) (b1 << 2 | b2 >> Base64Strict.FOURBYTE);
                decodedData[encodedIndex + 1] =
                (byte) ((b2 & 0xf) << Base64Strict.FOURBYTE | b3 >> 2 & 0xf);
                decodedData[encodedIndex + 2] = (byte) (b3 << 6 | b4);
            }
            else if (marker0 == Base64Strict.PAD)
            {
                decodedData[encodedIndex] = (byte) (b1 << 2 | b2 >> Base64Strict.FOURBYTE);
                decodedData[encodedIndex + 1] = (byte) ((b2 & 0xf) << Base64Strict.FOURBYTE);
                decodedData[encodedIndex + 2] = 0;
                pads += 2;
            }
            else if (marker1 == Base64Strict.PAD)
            {
                b3 = Base64Strict.Base64Alphabet[marker0];
                decodedData[encodedIndex] = (byte) (b1 << 2 | b2 >> Base64Strict.FOURBYTE);
                decodedData[encodedIndex + 1] =
                (byte) ((b2 & 0xf) << Base64Strict.FOURBYTE | b3 >> 2 & 0xf);
                decodedData[encodedIndex + 2] = (byte) (b3 << 6);
                pads++;
            }
            encodedIndex += 3;
        }

        byte out[] = new byte[decodedData.length - 1 - pads];
        System.arraycopy(decodedData, 0, out, 0, out.length);
        return out;
    }

    /**
    * Codifica di un Array di Byte in formato Base64.
    * <p><p>
    * @param binaryData Array di Byte da codificare.
    * <p><p>
    * @return Array di Byte codificato in Base64.
    */
    public static byte[] encode(byte binaryData[])
    {
        int lengthDataBits = binaryData.length * Base64Strict.EIGHTBIT;
        int fewerThan24bits = lengthDataBits % Base64Strict.TWENTYFOURBITGROUP;
        int numberTriplets = lengthDataBits / Base64Strict.TWENTYFOURBITGROUP;
        byte encodedData[] = (byte[]) null;

        if (fewerThan24bits != 0) {
            encodedData = new byte[(numberTriplets + 1) * Base64Strict.FOURBYTE];
        }
        else {
            encodedData = new byte[numberTriplets * Base64Strict.FOURBYTE];
        }

        byte k = 0;
        byte l = 0;
        byte b1 = 0;
        byte b2 = 0;
        byte b3 = 0;
        int encodedIndex = 0;
        int dataIndex = 0;
        int i = 0;
        for (i = 0; i < numberTriplets; i++)
        {
            dataIndex = i * 3;
            b1 = binaryData[dataIndex];
            b2 = binaryData[dataIndex + 1];
            b3 = binaryData[dataIndex + 2];
            l = (byte) (b2 & 0xf);
            k = (byte) (b1 & 3);
            encodedIndex = i * Base64Strict.FOURBYTE;
            byte val1 = (b1 & 0xffffff80) != 0 ? (byte) (b1 >> 2 ^ 0xc0) : (byte) (b1 >> 2);
            byte val2 = (b2 & 0xffffff80) != 0 ? (byte) (b2 >> Base64Strict.FOURBYTE ^ 0xf0) : (byte) (b2 >> Base64Strict.FOURBYTE);
            byte val3 = (b3 & 0xffffff80) != 0 ? (byte) (b3 >> 6 ^ 0xfc) : (byte) (b3 >> 6);
            encodedData[encodedIndex] = Base64Strict.LookUpBase64Alphabet[val1];
            encodedData[encodedIndex + 1] = Base64Strict.LookUpBase64Alphabet[val2 | k << Base64Strict.FOURBYTE];
            encodedData[encodedIndex + 2] = Base64Strict.LookUpBase64Alphabet[l << 2 | val3];
            encodedData[encodedIndex + 3] = Base64Strict.LookUpBase64Alphabet[b3 & 0x3f];
        }

        dataIndex = i * 3;
        encodedIndex = i * Base64Strict.FOURBYTE;
        if (fewerThan24bits == Base64Strict.EIGHTBIT)
        {
            b1 = binaryData[dataIndex];
            k = (byte) (b1 & 3);
            byte val1 = (b1 & 0xffffff80) != 0 ? (byte) (b1 >> 2 ^ 0xc0) : (byte) (b1 >> 2);
            encodedData[encodedIndex] = Base64Strict.LookUpBase64Alphabet[val1];
            encodedData[encodedIndex + 1] = Base64Strict.LookUpBase64Alphabet[k << Base64Strict.FOURBYTE];
            encodedData[encodedIndex + 2] = Base64Strict.PAD;
            encodedData[encodedIndex + 3] = Base64Strict.PAD;
        }
        else if (fewerThan24bits == Base64Strict.SIXTEENBIT)
        {
            b1 = binaryData[dataIndex];
            b2 = binaryData[dataIndex + 1];
            l = (byte) (b2 & 0xf);
            k = (byte) (b1 & 3);
            byte val1 = (b1 & 0xffffff80) != 0 ? (byte) (b1 >> 2 ^ 0xc0) : (byte) (b1 >> 2);
            byte val2 = (b2 & 0xffffff80) != 0 ? (byte) (b2 >> Base64Strict.FOURBYTE ^ 0xf0) : (byte) (b2 >> Base64Strict.FOURBYTE);
            encodedData[encodedIndex] = Base64Strict.LookUpBase64Alphabet[val1];
            encodedData[encodedIndex + 1] = Base64Strict.LookUpBase64Alphabet[val2 | k << Base64Strict.FOURBYTE];
            encodedData[encodedIndex + 2] = Base64Strict.LookUpBase64Alphabet[l << 2];
            encodedData[encodedIndex + 3] = Base64Strict.PAD;
        }
        return encodedData;
    }

    /**
    * Verifica che l'Array di Byte passato nel parametro <b><code>arrayOctect</code></b>
    * Ã¨ codificato in formato Base64.
    * <p><p>
    * @param arrayOctect Array di Byte oggetto della verifica.
    * <p><p>
    * @return true se l'Array di Byte Ã¨ codificato in formato Base64.
    */
    public static boolean isArrayByteBase64(byte arrayOctect[])
    {
        int length = arrayOctect.length;
        if (length == 0) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            if (!isBase64(arrayOctect[i])) {
                return false;
            }
        }

        return true;
    }

    /**
    * Verifica se il Byte passato nel parametro <b><code>octect</code></b>
    * Ã¨ codificato in formato Base64c.
    * <p><p>
    * @param octect Byte oggetto della verifica.
    * <p><p>
    * @return true se il Byte Ã¨ codificato in formato Base64.
    */
    public static boolean isBase64(byte octect)
    {
        return octect == Base64Strict.PAD || Base64Strict.Base64Alphabet[octect] != -1;
    }

    /**
    * Verifica se la Stringa passata nel parametro <b><code>isValidString</code></b>
    * Ã¨ codificato in formato Base64.
    * <p><p>
    * @param isValidString String oggetto della verifica.
    * <p><p>
    * @return true se la Stringa passata Ã¨ codificata in formato Base64.
    * @throws UnsupportedEncodingException
    */
    public static boolean isBase64(String isValidString) throws UnsupportedEncodingException
    {
        return isArrayByteBase64(isValidString.getBytes("UTF-8"));
    }

    /**
    * Inizializzazioni statiche della classe.
    */
    static {
        Base64Strict.Base64Alphabet = new byte[Base64Strict.BASELENGTH];
        Base64Strict.LookUpBase64Alphabet = new byte[Base64Strict.LOOKUPLENGTH];
        int i;
        for (i = 0; i < Base64Strict.BASELENGTH; i++) {
            Base64Strict.Base64Alphabet[i] = -1;
        }

        for (i = 90; i >= 65; i--) {
            Base64Strict.Base64Alphabet[i] = (byte) (i - 65);
        }

        for (i = 122; i >= 97; i--) {
            Base64Strict.Base64Alphabet[i] = (byte) ((i - 97) + 26);
        }

        for (i = 57; i >= 48; i--) {
            Base64Strict.Base64Alphabet[i] = (byte) ((i - 48) + 52);
        }

        Base64Strict.Base64Alphabet[43] = 62;
        Base64Strict.Base64Alphabet[47] = 63;

        for (i = 0; i <= 25; i++) {
            Base64Strict.LookUpBase64Alphabet[i] = (byte) (65 + i);
        }

        i = 26;
        for (int j = 0; i <= 51; j++)
        {
            Base64Strict.LookUpBase64Alphabet[i] = (byte) (97 + j);
            i++;
        }

        i = 52;
        for (int j = 0; i <= Base64Strict.PAD; j++)
        {
            Base64Strict.LookUpBase64Alphabet[i] = (byte) (48 + j);
            i++;
        }

        Base64Strict.LookUpBase64Alphabet[62] = 43;
        Base64Strict.LookUpBase64Alphabet[63] = 47;
    }
}
