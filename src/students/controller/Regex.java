package students.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static final String REGEX_ID = "[C|c]{1}[0-9]{4}[H-I-K|h-i-k]{1}[0-9]{1}$";
    public static final String REGEX_NAME = "[A-Za-z]+$";
    public static final String REGEX_BORN = "^[0-9]{2}[-|/]+[0-9]{2}[-|/]+[0-9]{4}$";
    public static final String REGEX_GEN = "^[0|1]+$";
    public static final String REGEX_ADD = "^[A-Za-z0-9]+$";
    public static final String REGEX_MAIL = "[a-z0-9]+@[a-z0-9]+[.]{1}[a-z]+$";
    public static final String REGEX_MARK = "^[0-9]+$";

    public static boolean validate(String REGEX, String content) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(content);
        return matcher.matches();
    }
}
