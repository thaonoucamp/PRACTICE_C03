package officcer.behavirol;

import officcer.creat.Engineer;
import officcer.creat.Officer;
import officcer.creat.Staff;
import officcer.creat.Worker;

import java.util.Scanner;

public class Management extends AbsAction {
    Officer[] officers;

    int code = 1;

    Scanner sc = new Scanner(System.in);

    public Management() {
        officers = new Officer[3];
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

        officer.setId(code);
        code++;

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

        engineer.setId(code);
        code++;

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

        staff.setId(code);
        code++;

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
    public void add(Officer[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.println("Enter the index " + (i + 1));
            if (e[i] == null){
                e[i] = input();
            }
        }
        show(e);
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
        show(e);
    }

    @Override
    public void delete(Officer[] e) {
        int index = find(e);
        for (int i = 0; i < e.length; i++) {
            if (i == index) {
                if (index == e.length - 1) {
                    e[e.length - 1] = null;
                    break;
                }
                i = i + 1;
            }
        }
        show(e);
    }

    @Override
    public int find(Officer[] e) {
        System.out.println("Enter the name want to find");
        String type = sc.nextLine();
        for (int i = 0; i < e.length; i++) {
            if (e[i].getName().equals(type)) {
                System.out.println(e[i] + "index " + i);
                return i;
            }
        }
        return 0;
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
                case 1 -> add(officers);
                case 2 -> edit(officers);
                case 3 -> delete(officers);
                case 4 -> sort(officers);
                case 5 -> find(officers);
                case 6 -> show(officers);
                case 7 -> System.exit(7);
            }
        } while (choice != 0);
    }
}
