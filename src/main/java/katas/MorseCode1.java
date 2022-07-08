package katas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

enum MorseCode1 {
    WHITE_SPACE("   "),
    SBL(" "),//whitespace between letters
    A(".-"),
    B("-..."),
    C("-.-."),
    D("-.."),
    E("."),
    F("..-."),
    G("--."),
    H("...."),
    I(".."),
    J(".---"),
    K("-.-"),
    L(".-.."),
    M("--"),
    N("-."),
    O("---"),
    P(".--."),
    Q("--.-"),
    R(".-."),
    S("..."),
    T("-"),
    U("..-"),
    V("...-"),
    W(".--"),
    X("-..-"),
    Y("-.--"),
    Z("--.."),

    ;

    private static final Map<String, MorseCode1> s_valuesById =
            Collections.unmodifiableMap(
                    Arrays.stream(values()).collect(Collectors.toMap(MorseCode1::getMorse, Function.identity())));

    public static MorseCode1 valueOfId(final String key)
            throws IllegalArgumentException {
        if (!s_valuesById.containsKey(key)) {
            throw new IllegalArgumentException(
                    String.format("No %s value was found for key value %s.", MorseCode1.class.getName(), key));
        }
        return s_valuesById.get(key);
    }

    private String morse;

    MorseCode1(String morse) {
        this.morse = morse;
    }

    public String getMorse() {
        return morse;
    }
}
