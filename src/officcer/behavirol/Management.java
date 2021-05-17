package officcer.behavirol;

import officcer.creat.Engineer;
import officcer.creat.Officer;
import officcer.creat.Staff;
import officcer.creat.Worker;

import java.util.Scanner;

public class Management extends AbsAction{
    Officer[] officers = new Officer[5];
    Scanner sc = new Scanner(System.in);

    @Override
    public Officer input() {
        Officer newOfficer = new Officer();
        System.out.println("Enter the name");
        newOfficer.setName(sc.nextLine());

        System.out.println("Enter the age");
        newOfficer.setAge(sc.nextLine());

        System.out.println("Enter the gen");
        newOfficer.setGen(sc.nextLine());

        System.out.println("Enter the address");
        newOfficer.setAge(sc.nextLine());

        choiceType();

        return newOfficer;
    }

    public void choiceType() {
        System.out.println("Enter data type" +
                "\n1. worker" +
                "\n2. engineer" +
                "\n3. staff");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> inputWorker();
            case 2 -> inputEngineer();
            case 3 -> inputStaff();
        }
    }

    @Override
    public void inputWorker() {
        System.out.println("Enter the work");
        Worker officer = new Worker();
        officer.setWork(sc.nextLine());
    }

    @Override
    public void inputEngineer() {
        Engineer engineer = new Engineer();
        System.out.println("Enter the train");
        engineer.setTrain(sc.nextLine());
    }

    @Override
    public void inputStaff() {
        Staff staff = new Staff();
        System.out.println("Enter the wage");
        staff.setWage(sc.nextLine());
    }

    @Override
    public void add(Officer[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.println("Enter the index " + i);
            e[i] = input();
        }
    }

    @Override
    public void edit(Officer[] e) {
        System.out.println("Enter data type want to edit");
        String type = sc.nextLine();
        for (int i = 0; i < e.length; i++) {
            if (e[i].equals(type)) {
                e[i] = input();
                break;
            }
        }
    }

    @Override
    public void delete(Officer[] e) {
        System.out.println("Enter data type want to delete");
        String type = sc.nextLine();
        for (int i = 0; i < e.length; i++) {
            if (e[i].equals(type)) {
                e[i] = null;
                break;
            }
        }
    }

    @Override
    public void find(Officer[] e) {
        System.out.println("Enter data type want to find");
        String type = sc.nextLine();
        for (int i = 0; i < e.length; i++) {
            if (e[i].equals(type)) {
                System.out.println(e[i]);
                break;
            }
        }
    }

    @Override
    public void sort(Officer[] e) {

    }

    @Override
    public void show(Officer[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }

    public void menu() {
        int choice;
        do {
            System.out.println("---------" +
                    "\nMenu :" +
                    "\n1. add" +
                    "\n2. edit" +
                    "\n3. delete" +
                    "\n4. sort" +
                    "\n5. find" +
                    "\n6. show" +
                    "\n7. exit" +
                    "\nEnter the choice");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    add(officers);
                    break;
                case 2:
                    edit(officers);
                    break;
                case 3:
                    delete(officers);
                    break;
                case 4:
                    sort(officers);
                    break;
                case 5:
                    find(officers);
                    break;
                case 6:
                    show(officers);
                    break;
                case 7:
                    System.exit(7);
            }
        } while (choice != 0);
    }
}
