package officcer.behavirol;

import officcer.creat.Engineer;
import officcer.creat.Officer;
import officcer.creat.Staff;
import officcer.creat.Worker;

import java.util.Scanner;

public class Management extends AbsAction {
    int quantity;
    Officer[] officers;

    Scanner sc = new Scanner(System.in);

    public Management() {
        officers = new Officer[quantity];
        quantity = 0;
    }

    @Override
    public Officer input() {
        System.out.println("Enter data type" +
                "\n1. worker" +
                "\n2. engineer" +
                "\n3. staff");
        int choice = Integer.parseInt(sc.nextLine());
        if (choice == 1) {
            return inputWorker();
        } else if (choice == 2) {
            return inputEngineer();
        } else {
            return inputStaff();
        }
    }

    @Override
    public Worker inputWorker() {
        Worker officer = new Worker();

        System.out.println("Enter the name");
        officer.setName(sc.nextLine());

        System.out.println("Enter the age");
        officer.setAge(sc.nextLine());

        System.out.println("Enter the gen");
        officer.setGen(sc.nextLine());

        System.out.println("Enter the address");
        officer.setAddress(sc.nextLine());

        System.out.println("Enter the work");
        officer.setWork(sc.nextLine());

        return officer;
    }

    @Override
    public Engineer inputEngineer() {
        Engineer engineer = new Engineer();

        System.out.println("Enter the name");
        engineer.setName(sc.nextLine());

        System.out.println("Enter the age");
        engineer.setAge(sc.nextLine());

        System.out.println("Enter the gen");
        engineer.setGen(sc.nextLine());

        System.out.println("Enter the address");
        engineer.setAddress(sc.nextLine());

        System.out.println("Enter the train");
        engineer.setTrain(sc.nextLine());

        return engineer;
    }

    @Override
    public Staff inputStaff() {
        Staff staff = new Staff();

        System.out.println("Enter the name");
        staff.setName(sc.nextLine());

        System.out.println("Enter the age");
        staff.setAge(sc.nextLine());

        System.out.println("Enter the gen");
        staff.setGen(sc.nextLine());

        System.out.println("Enter the address");
        staff.setAddress(sc.nextLine());

        System.out.println("Enter the wage");
        staff.setWage(sc.nextLine());

        return staff;
    }

    @Override
    public void add(Officer e) {
        officers[quantity] = e;
        quantity++;
        show();
    }

    @Override
    public void edit(Officer[] e) {
        System.out.println("Enter the name want to edit");
        String type = sc.nextLine();
        for (int i = 0; i < e.length; i++) {
            if (e[i].getName().equals(type)) {
                e[i] = input();
                break;
            }
        }
        show();
    }

    @Override
    public void delete(Officer[] e) {
        System.out.println("Enter the name want to delete");
        String type = sc.nextLine();
        for (int i = 0; i < e.length; i++) {
            if (e[i].getName().equals(type)) {
                e[i] = null;
                break;
            }
        }
        show();
    }

    @Override
    public void find(Officer[] e) {
        System.out.println("Enter the name want to find");
        String type = sc.nextLine();
        for (int i = 0; i < e.length; i++) {
            if (e[i].getName().equals(type)) {
                System.out.println(e[i]);
                break;
            }
        }
    }

    @Override
    public void sort(Officer[] e) {
    }

    @Override
    public void show() {
        for (int i = 0; i < quantity; i++) {
            System.out.println(i);
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
                case 1 -> add(input());
                case 2 -> edit(officers);
                case 3 -> delete(officers);
                case 4 -> sort(officers);
                case 5 -> find(officers);
                case 6 -> show();
                case 7 -> System.exit(7);
            }
        } while (choice != 0);
    }
}
