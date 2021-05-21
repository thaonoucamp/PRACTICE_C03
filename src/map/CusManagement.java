package map;

import com.sun.source.tree.Tree;

import java.util.*;

public class CusManagement implements IManagement<String, Customer> {
    transient Scanner sc = new Scanner(System.in);

    public Map<String, Customer> map;

    public CusManagement() {
        map = new HashMap<>();
//        map = new LinkedHashMap<>();
//        map = new TreeMap<>();
    }

    @Override
    public Customer input() {
        Customer cusNew = new Customer();

        System.out.println("Enter the name");
        cusNew.setCusName(sc.nextLine());

        System.out.println("Enter the age");
        cusNew.setCusAge(sc.nextLine());

        System.out.println("Enter the gender");
        cusNew.setCusGender(sc.nextLine());

        System.out.println("Enter the address");
        cusNew.setCusAddress(sc.nextLine());

        System.out.println("Enter the telephone");
        cusNew.setCusTelephone(sc.nextLine());

        return cusNew;
    }

    @Override
    public void add(String key, Customer value) {

    }

    public void add() {
        System.out.println("Enter the quantity");
        int quantity = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the item at index " + (i + 1));
            System.out.println("Enter the key");
            String key = sc.nextLine();
            this.map.put(key, input());
        }
        show();
    }

    @Override
    public void edit(Map<String, Customer> map) {
        for (int i = 0; i < map.size(); i++) {
            System.out.println("Enter the key want to edit ");
            String key = sc.nextLine();
            if (map.get(key).equals(key)) {
                this.map.replace(key, input());
                break;
            }
        }
        show();
    }

    @Override
    public void delete(Map<String, Customer> map) {
        for (int i = 0; i < map.size(); i++) {
            System.out.println("Enter the key want to delete ");
            String key = sc.nextLine();
            if (map.get(key).equals(key)) {
                this.map.remove(key);
                break;
            }
        }
        show();
    }

    @Override
    public void find(Map<String, Customer> map) {

    }

    @Override
    public void show() {
        for (Map.Entry<String, Customer> entry :
                this.map.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("----------");
//        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            System.out.println(map.get(key));
//        }
    }

    @Override
    public void menu() {
        int choice;
        do {
            System.out.println("------------" +
                    "\nMenu :" +
                    "\n1 -> add" +
                    "\n2 -> edit" +
                    "\n3 -> delete" +
                    "\n4 -> find" +
                    "\n5 -> exit" +
                    "\n---> choice ?");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> add();
                case 2 -> edit(this.map);
                case 3 -> delete(this.map);
                case 4 -> find(this.map);
                case 5 -> show();
                case 6 -> System.exit(6);
            }
        } while (choice != 0);
    }
}
