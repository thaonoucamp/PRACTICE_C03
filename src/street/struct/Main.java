package street.struct;

import street.behaviral.ManagementStreet;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ManagementStreet managementStreet = new ManagementStreet();
        managementStreet.menu();
    }
}
