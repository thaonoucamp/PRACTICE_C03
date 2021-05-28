package hotel.structural;

import hotel.behaviral.ManageHotel;
import hotel.creat.Customer;
import hotel.creat.Room;
import student.behaviral.Management;

import java.io.IOException;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {
        ManageHotel management = new ManageHotel();
        ArrayList<Room> list = new ArrayList<Room>();
        ArrayList<Customer> list1 = new ArrayList<>();
        list1.add(new Customer("a", 0, 1, 1, "a"));
        list1.add(new Customer("b", 9, 2, 1, "a"));
        Room room_1=new Room(1,2,list1);
        list.add(room_1);
        management.addForTest(list);
        management.show(list);
        System.out.println(list1.size());

    }
}
