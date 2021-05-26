package street.behaviral;

import street.creat.Family;
import street.creat.Person;

import java.util.*;
import java.util.stream.Collectors;

public class ManagementStreet {
    transient Scanner sc = new Scanner(System.in);
    private int idPerson;
    private int idFamily;
    private ArrayList<Family> listStreet;

    public ManagementStreet() {
        listStreet = new ArrayList<>();
        idPerson = 1;
        idFamily = 1;
    }

    public Person input() {
        Person person = new Person();

        System.out.println("Enter the name");
        person.setName(sc.nextLine());

        System.out.println("Enter the gender");
        person.setGender(sc.nextLine());

        System.out.println("Enter the age");
        person.setAge(Integer.parseInt(sc.nextLine()));

        person.setId(idPerson);
        idPerson++;

        System.out.println("Enter the job");
        person.setJob(sc.nextLine());

        return person;
    }

    public void add() {
        System.out.println("choice want to add of type" +
                "\n1 -> add family" +
                "\n2 -> add member");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> addFamilies();
            case 2 -> insertMember();
        }
    }

    public Family addMembers() {
        ArrayList<Person> people = new ArrayList<>();

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
        show();
    }

    public void findById() {
        System.out.println("Enter the id want to find of person");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < listStreet.size(); i++) {
            for (int j = 0; j < listStreet.get(i).getListMembers().size(); j++) {
                if (id == listStreet.get(i).getListMembers().get(j).getId()) {
                    System.out.println(listStreet.get(j));
                    break;
                }
            }
        }
    }

    public void findByName() {
        System.out.println("Enter the name want to find of person");
        String name = sc.nextLine();

        for (int i = 0; i < listStreet.size(); i++) {
            for (int j = 0; j < listStreet.get(i).getListMembers().size(); j++) {
                if (listStreet.get(i).getListMembers().get(j).getName().equals(name)) {
                    System.out.println(listStreet.get(j));
                    break;
                }
            }
        }
    }

    public void find() {
        System.out.println("choice want to find of type" +
                "\n1 -> find by family" +
                "\n2 -> find by name" +
                "\n3 -> find by id"
        );
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> findByFamily();
            case 2 -> findByName();
            case 3 -> findById();
        }
    }

    public void findByFamily() {
        System.out.println("Enter the id want to find of family");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < listStreet.size(); i++) {
            if (id == listStreet.get(i).getIdHome()) {
                System.out.println(listStreet.get(i));
                break;
            }
        }
    }

    public void edit() {
        System.out.println("Enter the id want to edit of person");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < listStreet.size(); i++) {
            for (int j = 0; j < listStreet.get(i).getListMembers().size(); j++) {
                if (id == listStreet.get(i).getListMembers().get(j).getId()) {
                    listStreet.get(i).getListMembers().set(j, input());
                    break;
                }
            }
        }
        show();
    }

    public void delete() {
        System.out.println("Enter the id want to delete of person");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < listStreet.size(); i++) {
            for (int j = 0; j < listStreet.get(i).getListMembers().size(); j++) {
                if (id == listStreet.get(i).getListMembers().get(j).getId()) {
                    listStreet.get(i).getListMembers().remove(j);
                    break;
                }
            }
        }
        show();
    }

    public void sort() {
        List<Person> personList = getListPerson();
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getName().equals(o2.getName())) {
                    return o1.getAge() - o2.getAge();
                }
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public List<Person> getListPerson() {
        for (int i = 0; i < listStreet.size(); i++) {
            for (int j = 0; j < listStreet.get(i).getListMembers().size(); j++) {
                List<Person> listPerson = listStreet.get(i).getListMembers();
                return listPerson;
            }
        }
        return null;
    }

    public void insertMember() {
        System.out.println("Enter the id want to insert of family");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < listStreet.size(); i++) {
            if (id == listStreet.get(i).getIdHome()) {
                for (int j = 0; j < listStreet.get(i).getListMembers().size(); j++) {
                    listStreet.get(i).getListMembers().add(input());
                    break;
                }
            }
        }
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
            System.out.println("------------" +
                    "\n*** Menu ***" +
                    "\n1 -> add " +
                    "\n2 -> edit " +
                    "\n3 -> delete" +
                    "\n4 -> find " +
                    "\n5 -> sort" +
                    "\n6 -> exit"
            );
            System.out.println("Enter the choice your?");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> add();
                case 2 -> edit();
                case 3 -> delete();
                case 4 -> find();
                case 5 -> sort();
                case 6 -> System.exit(6);
            }
        } while (choice != 0);
    }
}
