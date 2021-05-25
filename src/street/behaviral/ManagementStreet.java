package street.behaviral;

import street.creat.Family;
import street.creat.Person;
import street.creat.Street;

import java.util.*;

public class ManagementStreet {
    transient Scanner sc = new Scanner(System.in);

    private List<Person> listStreet;

    public ManagementStreet() {
        listStreet = new ArrayList<>();
    }

    public Person input() {
        Person person = new Person();

        System.out.println("Enter the name");
        person.setName(sc.nextLine());

        System.out.println("Enter the age");
        person.setAge(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter the id");
        person.setId(sc.nextLine());

        System.out.println("Enter the job");
        person.setJob(sc.nextLine());

        return person;
    }

    public Family addMembers() {
        List<Person> people = new ArrayList<>();

        System.out.println("Enter the id home");
        int id = Integer.parseInt(sc.nextLine());

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

    public void show() {
        Iterator iterator = listStreet.iterator();
        while (iterator.hasNext()) {
            Object person = iterator.next();
            System.out.println(person);
        }
    }
}
