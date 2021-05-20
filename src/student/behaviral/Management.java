package student.behaviral;

import student.creat.Student;

import java.util.*;

public class Management implements IManagement<Student> {
    int code = 1;

    transient Scanner sc = new Scanner(System.in);

    List<Student> students = new ArrayList<>();

    @Override
    public Student input() {
        Student newStudent = new Student();

        System.out.println("Enter the name");
        newStudent.setName(sc.nextLine());

        newStudent.setId(this.code);
        code++;

        System.out.println("Enter the age");
        newStudent.setAge(Integer.parseInt(sc.nextLine()));

        return newStudent;
    }

    @Override
    public void add(List<Student> list) {
        System.out.println("Enter the quantity want to add");
        int quantity = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the item at index " + (i + 1));
            list.add(input());
        }
        show(list);
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
        show(list);
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
        show(list);
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

    public void findName(List<Student> list) {
        System.out.println("Enter the name want to find");
        String name = sc.nextLine();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                System.out.println(list.get(i));
                break;
            }
        }
    }

    public int findIndex(List<Student> list) {
        System.out.println("Enter the id want to find");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
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
                    "\n4 -> find by id" +
                    "\n5 -> find by name" +
                    "\n6 -> exit" +
                    "\n--> choice ?"
            );
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> add(students);
                case 2 -> edit(students);
                case 3 -> delete(students);
                case 4 -> findId(students);
                case 5 -> findName(students);
                case 6 -> System.exit(6);
            }
        } while (choice != 0);
    }
}
