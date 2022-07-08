package katas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class KataMorseCode {

    public static void main(String[] args) {
//        MorseCode.A.getMorse()
//        System.out.println(decode(".... . -.--   .--- ..- -.. ."));
//        System.out.println(decode("...."));
//        System.out.println(decode(""));
    }

    private static String decode(String encodedValue){
        if (Objects.isNull(encodedValue)) return null;
        String[] encodedWords = encodedValue.split(MorseCode.WHITE_SPACE.getMorse());
        if (encodedWords.length < 0) return null;
        StringBuilder res = new StringBuilder();

        for (String s: encodedWords) {
            String[] word = s.split(MorseCode.SBL.getMorse());
            for (String letter: word) {
                res.append(MorseCode.valueOfId(letter).toString());
            }
            res.append(" ");
        }

        return res.toString().trim();
    }

    enum MorseCode {
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

        private static final Map<String, MorseCode> s_valuesById =
                Collections.unmodifiableMap(
                        Arrays.stream(values()).collect(Collectors.toMap(MorseCode::getMorse, Function.identity())));

        public static MorseCode valueOfId(final String key)
                throws IllegalArgumentException {
            if (!s_valuesById.containsKey(key)) {
                throw new IllegalArgumentException(
                        String.format("No %s value was found for key value %s.", MorseCode.class.getName(), key));
            }
            return s_valuesById.get(key);
        }

        private String morse;

        MorseCode(String morse) {
            this.morse = morse;
        }

        public String getMorse() {
            return morse;
        }
    }

}
