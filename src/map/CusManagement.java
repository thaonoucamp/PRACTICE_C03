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

    @Override
    public void edit(Map<String, Customer> map) {

    }

    @Override
    public void delete(Map<String, Customer> map) {

    }

    @Override
    public void find(Map<String, Customer> map) {

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

    public void edit() {
        System.out.println("Enter the key want to edit ");
        String key = sc.nextLine();
        for (Map.Entry<String, Customer> entry : map.entrySet()) {
            if (entry.getKey().equals(key)) {
                entry.setValue(input());
                break;
            }
        }
        show();
    }

    public void delete() {
        System.out.println("Enter the key want to delete ");
        String key = sc.nextLine();
        for (Map.Entry<String, Customer> entry : map.entrySet()) {
            if (entry.getKey().equals(key)) {
                map.remove(key);
                break;
            }
        }
        show();
    }

    public void find() {
        System.out.println("Enter the key want to find ");
        String key = sc.nextLine();
        for (Map.Entry<String, Customer> entry : map.entrySet()) {
            if (entry.getKey().equals(key)) {
                System.out.println(entry.getKey() + entry.getValue());
                break;
            }
        }
    }

    public void sort() {
        List<Map.Entry<String, Customer>> list = new LinkedList<>(map.entrySet());
        Object customer = map.entrySet();
        Collections.sort(list, new Comparator<Map.Entry<String, Customer>>() {
            @Override
            public int compare(Map.Entry<String, Customer> o1, Map.Entry<String, Customer> o2) {
                if (o1.getValue().getCusName().compareTo(o2.getValue().getCusName()) > 0) {
                    return 1;
                } else if (o1.getValue().getCusName().compareTo(o2.getValue().getCusName()) < 0) {
                    return -1;
                } else if (o1.getValue().getCusAge().compareTo(o2.getValue().getCusAge()) > 0) {
                    return 1;
                } else if (o1.getValue().getCusAge().compareTo(o2.getValue().getCusAge()) < 0) {
                    return -1;
                }
                return 0;
            }
        });
    }

    @Override
    public void show() {
        for (Map.Entry<String, Customer> entry :
                this.map.entrySet()) {
            System.out.println(entry);
        }
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
                case 2 -> edit();
                case 3 -> delete();
                case 4 -> find();
                case 5 -> show();
                case 6 -> System.exit(6);
            }
        } while (choice != 0);
    }
}
