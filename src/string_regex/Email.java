package string_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static Pattern pattern;
    private Matcher matcher;

    public Email() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Email checkRegexEmail = new Email();
        boolean isValid;
        String[] email_1 = {"a@gmail.com", "b@yahoo.com", "abc@dangiafc.com"};
        String[] email_2 = {"@gmail.com", "b@yahoo.", "abc@dangiafc"};

        for (String s : email_1) {
            isValid = checkRegexEmail.validate(s);
            System.out.println("email is : " + s + " validate = " + isValid);
        }

        for (String s :
                email_2) {
            isValid = checkRegexEmail.validate(s);
            System.out.println("email is : " + s + " validate = " + isValid);
        }
    }
}
