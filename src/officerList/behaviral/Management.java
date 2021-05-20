package officerList.behaviral;

import officerList.creat.Engineer;
import officerList.creat.Officer;
import officerList.creat.Staff;
import officerList.creat.Worker;

import java.util.*;

public class Management implements IManagement<Officer> {
    Scanner sc = new Scanner(System.in);

    List<Officer> listOfficers;

    public Management() {
        this.listOfficers = new ArrayList<Officer>();
    }

    @Override
    public Officer input() {
        int choice;
        do {
            System.out.println("Enter the data type to add" +
                    "\n1. Worker" +
                    "\n2. Staff" +
                    "\n3. Engineer"
            );
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    return inputWorker();
                case 2:
                    return inputStaff();
                case 3:
                    return inputEngineer();
            }
        } while (choice != 0);

        return null;
    }

    private Engineer inputEngineer() {
        Engineer engineer = new Engineer();

        System.out.println("Enter the name");
        engineer.setName(sc.nextLine());

        System.out.println("Enter the age");
        engineer.setAge(sc.nextLine());

        System.out.println("Enter the gen");
        engineer.setGen(sc.nextLine());

        System.out.println("Enter the address");
        engineer.setAddress(sc.nextLine());

        System.out.println("Enter the instruction");
        engineer.setInstruction(sc.nextLine());

        return engineer;
    }

    private Staff inputStaff() {
        Staff staff = new Staff();

        System.out.println("Enter the name");
        staff.setName(sc.nextLine());

        System.out.println("Enter the age");
        staff.setAge(sc.nextLine());

        System.out.println("Enter the gen");
        staff.setGen(sc.nextLine());

        System.out.println("Enter the address");
        staff.setAddress(sc.nextLine());

        System.out.println("Enter the instruction");
        staff.setWage(sc.nextLine());

        return staff;
    }

    private Worker inputWorker() {
        Worker worker = new Worker();

        System.out.println("Enter the name");
        worker.setName(sc.nextLine());

        System.out.println("Enter the age");
        worker.setAge(sc.nextLine());

        System.out.println("Enter the gen");
        worker.setGen(sc.nextLine());

        System.out.println("Enter the address");
        worker.setAddress(sc.nextLine());

        System.out.println("Enter the instruction");
        worker.setWork(sc.nextLine());

        return worker;
    }

    @Override
    public void add(Officer officer) {
        int quantity = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter item at index " + (i + 1));
            officer = input();
        }
    }

    @Override
    public int checkIndex(List<Officer> list) {
        sort(list);
        System.out.println("Enter the name");
        String name = sc.nextLine();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(name)) {
                return i;
            }
        }
        System.err.println("is not find");
        return -1;
    }

    @Override
    public void edit(List<Officer> list, int index) {
        index = checkIndex(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(index, input());
            break;
        }
        show(list);
    }

    @Override
    public void delete(List<Officer> list, int index) {
        index = checkIndex(list);
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
            break;
        }
        show(list);
    }

    @Override
    public int sort(List<Officer> list) {
        Collections.sort(list, new Comparator<Officer>() {
            @Override
            public int compare(Officer o1, Officer o2) {
                if (o1.getName().compareTo(o2.getName()) > 0) {
                    return 1;
                } else if (o1.getName().compareTo(o2.getName()) < 0) {
                    return -1;
                } else if ((o1.getAge().compareTo(o2.getAge())) > 0) {
                    return 1;
                } else if ((o1.getAge().compareTo(o2.getAge()) < 0)) {
                    return -1;
                } else
                    return 0;
            }
        });
        return 0;
    }

    @Override
    public int findIndex(List<Officer> list) {
        System.out.println("Enter the name");
        String name = sc.nextLine();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int findBinaryTree(List<Officer> list, int left, int right, int index) {
        sort(list);
        left = 0;
        right = list.size() - 1;
        int mid = (left + right) / 2;
        index = findIndex(list);

        if (mid == index) {
            return mid;
        }

        if (mid > index) {
            return findBinaryTree(list, mid + 1, right, index);
        }
        return findBinaryTree(list, left, mid - 1, index);
    }

    @Override
    public void show(List<Officer> list) {
        for (Officer officer :
                list) {
            System.out.println(officer);
        }
    }

    @Override
    public void menu() {
        int choice;
        do {
            System.out.println("---------" +
                    "\nMenu:" +
                    "\n1 -> add" +
                    "\n2 -> edit" +
                    "\n3 -> delete" +
                    "\n4 -> find index" +
                    "\n5 -> find binary" +
                    "\n6 -> exit" +
                    "\n--> choice ?"
            );
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> add(input());
                case 2 -> edit(listOfficers, checkIndex(listOfficers));
                case 3 -> delete(listOfficers, checkIndex(listOfficers));
                case 4 -> findIndex(listOfficers);
//                case 5 -> findBinaryTree(listOfficers, );
                case 6 -> System.exit(6);
            }
        } while (choice != 0);
    }
}
