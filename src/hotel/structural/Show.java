package hotel.structural;

import hotel.behaviral.ManageHotel;
import student.behaviral.Management;

import java.io.IOException;
import java.util.Scanner;

public class Show {
    private static String[] account = {"dangiafc", "dangxuanthao"};

    public static boolean login() {
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

    public static void main(String[] args) throws IOException {
        ManageHotel hotel = new ManageHotel();
        if (login()) {
            hotel.menu();
        }
    }
}
