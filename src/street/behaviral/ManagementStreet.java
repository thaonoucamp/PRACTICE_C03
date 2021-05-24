package street.behaviral;

import street.creat.Family;
import street.creat.Person;
import street.creat.Street;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementStreet {
    transient Scanner sc = new Scanner(System.in);

    private List<Family> listStreet;
    private List<Person> listFamily;

    public ManagementStreet() {
        listStreet = new ArrayList<>();
        listFamily = new ArrayList<>();
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

    public void add() {
        Family family = new Family();
        Street street = new Street();
        System.out.println("Enter quantity family of the street");
        street.setQuantityFamily(Integer.parseInt(sc.nextLine()));

        for (int i = 0; i < street.getQuantityFamily(); i++) {
            System.out.println("Enter information family at index " + (i + 1));
            System.out.println("Enter quantity members of the family");
            family.setQuantityMember(Integer.parseInt(sc.nextLine()));
            for (int j = 0; j < family.getQuantityMember(); j++) {
                System.out.println("Enter the id home");
                family.setIdHome(Integer.parseInt(sc.nextLine()));
                System.out.println("Enter information member at index " + (i + 1));
                listFamily.add(input());
            }
        }
        show();
    }

    public void show() {
        for (int i = 0; i < listStreet.size(); i++) {
            for (int j = 0; j < listFamily.size(); j++) {
                System.out.println(listFamily.get(i));
//                System.out.println(listFamily.);
            }
        }
    }


}
