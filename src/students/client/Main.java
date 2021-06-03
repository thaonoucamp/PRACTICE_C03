package students.client;

import students.controller.Management;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Management management = new Management();
        management.menu();
    }
}
