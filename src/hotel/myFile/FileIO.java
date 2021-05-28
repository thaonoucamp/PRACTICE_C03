package hotel.myFile;

import hotel.creat.Customer;
import hotel.creat.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class FileIO {
    String FILE_PATH = "/Users/thaodangxuan/IdeaProjects/PRACTICE_C03/src/hotel/myFile/hotel.csv";

    public void writer(ArrayList<Room> list) throws IOException {
        FileWriter fileWriter = new FileWriter(new File(FILE_PATH));
        fileWriter.close();
    }

    public ArrayList<Room> reader(String filePath, ArrayList<Room> list) throws IOException {
        FileReader fileReader = new FileReader(new File(FILE_PATH));
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        bufferedReader.readLine();
        String line = null;
        int id;
        String name;
        int age;
        int rentDays;
        String typeRoom;
        while ((line = bufferedReader.readLine()) != null) {
            String[] item = line.split(",");

            id = Integer.parseInt(item[3]);
            name = item[4];
            age = Integer.parseInt(item[5]);
            rentDays = Integer.parseInt(item[5]);
            typeRoom = item[6];
            Customer customer = new Customer(name, age, id, rentDays, typeRoom);

            ArrayList<Customer> list1 = new ArrayList<>();
            list1.add(customer);

            list.add(new Room(item[0], item[1], Integer.parseInt(item[2]), list1));
        }
        return list;
    }
}
