package gojava.module5.practice.strings;

public class Replacer {

    public static String replaceInString (String initialString , String replaceWhat) {
        return initialString.replaceAll(replaceWhat, "");
    }
}
