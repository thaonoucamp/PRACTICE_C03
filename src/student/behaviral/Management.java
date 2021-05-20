package student.behaviral;

import student.creat.Student;

import java.util.*;

public class Management implements IManagement<Student> {

    transient Scanner sc = new Scanner(System.in);

    List<Student> students;

    public Management() {
        students = new ArrayList<>();
    }

    @Override
    public Student input() {
        Student newStudent = new Student();

        System.out.println("Enter the name");
        newStudent.setName(sc.nextLine());

        System.out.println("Enter the id");
        int id = Integer.parseInt(sc.nextLine());
        boolean check = true;
        do {
            if (checkId(students, id)) {
                newStudent.setId(id);
            }
            System.err.println("The id is repeated...!");
        } while (check);


        System.out.println("Enter the age");
        newStudent.setAge(Integer.parseInt(sc.nextLine()));

        return newStudent;
    }

    public boolean checkId(List<Student> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() != id) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void add(List<Student> list) {
        System.out.println("Enter the quantity want to add");
        int quantity = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the item at index " + (i + 1));
            list.add(input());
        }
    }

    @Override
    public void edit(List<Student> list) {
        System.out.println("Enter the id want to edit");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.set(i, input());
                break;
            }
        }
    }

    @Override
    public void delete(List<Student> list) {
        System.out.println("Enter the id want to delete");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(list.get(i));
                break;
            }
        }
    }

    @Override
    public void findId(List<Student> list) {
        System.out.println("Enter the id want to find");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                System.out.println(list.get(i));
                break;
            }
        }
    }

    @Override
    public void sort(List<Student> list) {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getName().compareTo(o2.getName()) > 0) {
                    return 1;
                } else if (o1.getName().compareTo(o2.getName()) < 0) {
                    return -1;
                } else if (o1.getAge() - o2.getAge() > 0) {
                    return 1;
                } else if (o1.getAge() - o2.getAge() < 0) {
                    return -1;
                } else if (o1.getId() - o2.getId() > 0) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }

    @Override
    public void show(List<Student> list) {
        sort(list);
        for (Student student :
                list) {
            System.out.println(student);
        }
    }

    public void menu() {
        int choice;
        do {
            System.out.println("---------" +
                    "\nMenu:" +
                    "\n1 -> add" +
                    "\n2 -> edit" +
                    "\n3 -> delete" +
                    "\n4 -> find id" +
                    "\n5 -> exit" +
                    "\n--> choice ?"
            );
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> add(students);
                case 2 -> edit(students);
                case 3 -> delete(students);
                case 4 -> findId(students);
                case 5 -> System.exit(5);
            }
        } while (choice != 0);
    }
}
