package hotel.behaviral;

import hotel.creat.Customer;
import hotel.creat.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageHotel implements IManagement<Room> {
    private int idCustomer;
    private int idRoom;
    private List<Room> rooms;

    transient Scanner sc = new Scanner(System.in);

    public ManageHotel() {
        rooms = new ArrayList<>();
        idCustomer = 1;
        idRoom = 1;
    }

    public Customer input() {
        Customer newCus = new Customer();

        newCus.setId(idCustomer);
        idCustomer++;

        System.out.println("Enter the name");
        newCus.setName(sc.nextLine());

        System.out.println("Enter the age");
        newCus.setAge(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter the rent days");
        newCus.setRentDays(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter the type of room");
        newCus.setName(sc.nextLine());

        return newCus;
    }

    @Override
    public void edit(ArrayList<Room> list) {

    }

    @Override
    public void delete(ArrayList<Room> list) {

    }

    public Room addCus() {
        ArrayList<Customer> listCus = new ArrayList<>();

        System.out.println("Enter the quantity customer of room");
        int quantity = Integer.parseInt(sc.nextLine());

        int id = idRoom;
        idRoom++;

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the customer at index " + (i + 1));
            listCus.add(input());
        }

        Room room = new Room(id, quantity, listCus);

        return room;
    }

    @Override
    public ArrayList<Room> add(ArrayList<Room> list) {
        System.out.println("Enter the quantity room of hotel");
        int quantity = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter information of room " + (i + 1));

        }
        return null;
    }

    @Override
    public void find(ArrayList<Room> list) {

    }

    @Override
    public void sort(ArrayList<Room> list) {

    }

    @Override
    public void show(ArrayList<Room> list) {

    }

    @Override
    public void menu() {

    }

}
