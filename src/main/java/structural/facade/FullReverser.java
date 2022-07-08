package structural.facade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FullReverser implements Converter{

    @Override
    public String convert(String value) {
        List<String> strings = new ArrayList<>(List.of(value.split("")));
        Collections.reverse(strings);
        StringBuilder sb = new StringBuilder();
        strings.forEach(sb::append);
        return sb.toString().trim();
    }
}
