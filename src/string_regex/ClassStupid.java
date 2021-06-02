package string_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassStupid {
    private static final String REGEX = "^[A-C-P]{1}[0-9]{4}[G-H-I-K-M-N]{1}$";

    public static boolean validate(String string) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] clas = {"c0321k", "C090N", "c0221K", "CA0990HM"};
        for (String s :
                clas) {
            System.out.println("class is " + s + " validate = " + ClassStupid.validate(s));
        }
    }
}
