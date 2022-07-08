package structural.facade;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public class Facade {
    private Map<Type, Function<String, String>> map;

    public Facade() {
        initiateMap();
    }

    public String convert(Type type, String value){
        return map.get(type).apply(value);
    }

    private void initiateMap(){
        map = new EnumMap<>(Type.class);

        map.put(Type.BASE_64, (s -> new EncodedBase64().convert(s)));
        map.put(Type.FULL_REVERSE, (s -> new FullReverser().convert(s)));
        map.put(Type.WORDS_REVERSE, (s -> new WordsReverser().convert(s)));
    }
}
