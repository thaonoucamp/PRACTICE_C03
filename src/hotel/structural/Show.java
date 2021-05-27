package hotel.structural;

import java.util.Scanner;

public class Show {
    private String[] account = {"dangiafc", "dangxuanthao"};

    public boolean login() {
        String[] checkAccount = new String[2];
        boolean check = false;
        System.out.println("Login your account");
        do {
            System.out.print("ACCOUNT : ");
            String ac = new Scanner(System.in).nextLine();
            checkAccount[0] = ac;

            System.out.print("PASSWORD : ");
            String pass = new Scanner(System.in).nextLine();
            checkAccount[1] = pass;

            for (int i = 0; i < account.length; i++) {
                if (account[i].equals(checkAccount[i])) {
                    check = true;
                    return true;
                } else {
                    check = false;
                    System.err.println("The account or password is not right");
                }
            }
            return false;
        } while (check);
    }

    public static void main(String[] args) {

    }
}
