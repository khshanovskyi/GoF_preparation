package structural.facade;

import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;

public class EncodedBase64 implements Converter {
    @Override
    public String convert(String value) {
        String res = null;
        try {
            res = new Base64().encodeToString(value.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return res;
    }
}
