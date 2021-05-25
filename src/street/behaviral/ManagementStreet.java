package street.behaviral;

import street.creat.Family;
import street.creat.Person;
import street.creat.Street;

import java.util.*;

public class ManagementStreet {
    transient Scanner sc = new Scanner(System.in);

    int idPerson;
    int idFamily;
    private List<Person> listStreet;

    public ManagementStreet() {
        listStreet = new ArrayList<>();
        idPerson = 1;
        idFamily = 1;
    }

    public Person input() {
        Person person = new Person();

        System.out.println("Enter the name");
        person.setName(sc.nextLine());

        System.out.println("Enter the age");
        person.setAge(Integer.parseInt(sc.nextLine()));

        person.setId(idPerson);
        idPerson++;

        System.out.println("Enter the job");
        person.setJob(sc.nextLine());

        return person;
    }

    public Family addMembers() {
        List<Person> people = new ArrayList<>();

        int id = idFamily;
        idFamily++;

        System.out.println("Enter quantity members of members");
        int quantity = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the member at index " + (i + 1));
            people.add(input());
        }

        Family family = new Family(quantity, id, people);

        return family;
    }

    public void addFamilies() {
        System.out.println("Enter quantity family of street");
        int quantity = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the family at index " + (i + 1));
            listStreet.add(addMembers());
        }
    }

    public void findPerson() {
        System.out.println("Enter the id want to find");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < listStreet.size(); i++) {
            if (id == listStreet.get(i).getId()) {
                System.out.println(listStreet.get(i));
                break;
            }
        }
    }

    public void findByFamily() {

    }

    public void edit() {

    }

    public void delete() {

    }

    public void sort() {

    }

    public void show() {
        Iterator iterator = listStreet.iterator();
        while (iterator.hasNext()) {
            Object person = iterator.next();
            System.out.println(person);
        }
    }

    public void menu() {
        int choice;
        do {
            System.out.println("---------" +
                    "\n*** Menu ***" +
                    "\n1 -> add" +
                    "\n2 -> edit" +
                    "\n3 -> delete" +
                    "\n4 -> find" +
                    "\n5 -> sort" +
                    "\n6 -> exit"
            );
            System.out.println("Enter the choice ?");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> addFamilies();
                case 2 -> edit();
                case 3 -> delete();
                case 4 -> findPerson();
                case 5 -> sort();
                case 6 -> System.exit(6);
            }
        } while (choice != 0);
    }
}
