package hotel.behaviral;

import hotel.creat.Customer;
import hotel.creat.Room;
import hotel.myFile.FileIO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ManageHotel implements IManagement<Room> {
    private int idCustomer;
    private int idRoom;
    private List<Room> rooms;

    private FileIO fileIO = new FileIO();

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
public void addForTest(ArrayList<Room> list)throws IOException{
        fileIO.writer(list);
}
    @Override
    public void add(ArrayList<Room> list) throws IOException {
        System.out.println("Enter the quantity room of hotel");
        int quantity = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter information of room " + (i + 1));
            list.add(addCus());
        }
        show(list);
        fileIO.writer(list);
    }

    @Override
    public void find(ArrayList<Room> list) {

    }

    @Override
    public void sort(ArrayList<Room> list) {

    }

    @Override
    public void show(ArrayList<Room> list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Override
    public void menu() throws IOException {
        int choice;
        do {
            System.out.println("---------->" +
                    "\nMenu :" +
                    "\n1 -> add" +
                    "\n2 -> edit" +
                    "\n3 -> delete" +
                    "\n4 -> find" +
                    "\n5 -> sort" +
                    "\n6 -> check out" +
                    "\n7 -> exit" +
                    "\n<-----------" +
                    "\nWhat is choice ?");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> add((ArrayList<Room>) rooms);
                case 2 -> edit((ArrayList<Room>) rooms);
                case 3 -> delete((ArrayList<Room>) rooms);
                case 4 -> find((ArrayList<Room>) rooms);
                case 5 -> sort((ArrayList<Room>) rooms);
                case 6 -> checkOut((ArrayList<Room>) rooms);
                case 7 -> System.exit(7);
            }
        } while (choice != 0);
    }

    private void checkOut(ArrayList<Room> rooms) {
        System.out.println("Enter the id of room");
        int id = Integer.parseInt(sc.nextLine());

        long total;
        for (int i = 0; i < rooms.size(); i++) {

        }
    }

}
