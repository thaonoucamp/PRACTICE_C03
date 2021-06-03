package students.sever;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static boolean validate(String REGEX, String content){
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(content);
        return matcher.matches();
    }
}
