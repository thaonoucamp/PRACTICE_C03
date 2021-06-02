package street.struct;

import street.behaviral.ManagementStreet;
import street.creat.Family;
import street.myAccount.Login;
import street.myFile.FileCSV;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ManagementStreet managementStreet = new ManagementStreet();
        while (true) {
            if (Login.checkAccount()) {
                managementStreet.menu();
                break;
            }else {
                System.err.println("The account or password is not right !");
            }
        }
    }
}
