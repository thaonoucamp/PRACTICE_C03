package street.myAccount;

import street.behaviral.Regex;

import java.util.Scanner;

public class Login {
    private static final String[] account = {"dangiafc", "123456"};
    private static final String ACCOUNT_REGEX = "^[a-z]+$";
    private static final String PASS_REGEX = "^[0-9]{6}$";

    public static boolean checkAccount() {
        String[] checkAccount = inputAccount();
        for (int i = 0; i < account.length; i++) {
            if (account[i].equals(checkAccount[i])) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static String[] inputAccount() {
        Scanner sc = new Scanner(System.in);
        String[] checkAccount = new String[2];

        System.out.print("Login");
        System.out.print("ACCOUNT : ");
        String ac = sc.nextLine();
        while (true) {
            if (Regex.validate(ACCOUNT_REGEX, ac)) {
                checkAccount[0] = ac;
                break;
            } else {
                System.err.println("The account is not right !");
            }
        }


        System.out.print("PASSWORD : ");
        String pw = sc.nextLine();
        while (true) {
            if (Regex.validate(ACCOUNT_REGEX, ac)) {
                checkAccount[1] = pw;
                break;
            } else {
                System.err.println("The password is not right !");
            }
        }

        return checkAccount;
    }
}
