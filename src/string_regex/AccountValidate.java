package string_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountValidate {
    public AccountValidate() {
    }

    private final String REGEX = "^[_a-z0-9]{6,}$";

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        AccountValidate accounts = new AccountValidate();
        String[] acount_1 = {"123_abc", "javacore2_", "hello_"};
        String[] acount_2 = {"12abc", "java2_", "he_"};

        for (String s : acount_1) {
            System.out.println("account is : " + s + " validate = " + accounts.validate(s));
        }

        for (String s : acount_2) {
            System.out.println("account is : " + s + " validate = " + accounts.validate(s));
        }
    }
}
