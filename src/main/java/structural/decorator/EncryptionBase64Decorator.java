package structural.decorator;

import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;

public class EncryptionBase64Decorator extends DataSourceDecorator {
    public EncryptionBase64Decorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        try {
            super.writeData(new Base64().encodeToString(data.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readData() {
        Base64 base64 = new Base64();
        String data = super.readData();

        if (base64.isInAlphabet(data)) {
            try {
                byte[] decode = new Base64().decode(super.readData().getBytes("UTF-8"));
                return new String(decode);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }

        return data;
    }

}
