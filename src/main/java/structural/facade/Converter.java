package structural.facade;

import java.io.UnsupportedEncodingException;

public interface Converter {
    String convert(String value) throws UnsupportedEncodingException;
}
