package street.struct;

import street.behaviral.ManagementStreet;
import street.creat.Family;
import street.creat.Person;
import street.creat.Street;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ManagementStreet managementStreet=new ManagementStreet();
        managementStreet.addFamilies();
        managementStreet.show();

//        List<Person> street=new ArrayList<>();
//        List<Person> family=new ArrayList<>();
//        Person person=new Person("anh","id1",10,"acc");
//        family.add(person);
//        street.addAll(family);
//        System.out.println(street);

    }
}
