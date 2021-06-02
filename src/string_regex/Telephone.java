package string_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Telephone {
    private static final String REGEX = "^[0-9]{10}$";

    public static boolean validate(String string) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] numbers = {"034841039", "0812661990", "03544O1269"};
        for (String s :
                numbers) {
            System.out.println("telephone is : " + s + " validate = " + Telephone.validate(s));
        }
    }
}
