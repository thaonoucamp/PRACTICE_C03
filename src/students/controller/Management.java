package students.controller;

import students.sever.Student;

import java.io.IOException;
import java.util.*;

public class Management implements IManagement<Student> {
    private List<Student> studentList;
    private Scanner sc = new Scanner(System.in);
    private final int YEAR_CURRENT = 2021;

    public List<Student> getStudentList() {
        return studentList;
    }

    public Management() {
        try {
            this.studentList = FileCSV.reader(FileCSV.FILE_PATH);
        } catch (IOException e) {
            this.studentList = new ArrayList<>();
        }
    }

    @Override
    public Student input() {
        Student newStudent = new Student();

        while (true) {
            System.out.println("Enter the id with format [C1234(H|K|I)5]");
            String REGEX_ID = "^[C|c]{1}[0-9]{4}[H-I-K|h-i-k]{1}[0-9]{1}$";
            String id = sc.nextLine();
            boolean isOnly = checkIdOnly(studentList, id);
            if (Regex.validate(REGEX_ID, id) && isOnly) {
                newStudent.setId(id);
                break;
            }
            System.err.println("The id has duplicated !");
        }

        while (true) {
            System.out.println("Enter the name");
            String REGEX_NAME = "^[A-Za-z]+$";
            String name = sc.nextLine();
            if (Regex.validate(REGEX_NAME, name)) {
                newStudent.setName(name);
                break;
            }
            System.err.println("Enter to repeat !");
        }

        while (true) {
            System.out.println("Enter the birthday with format [DD-MM-YYYY]");
            String REGEX_BORN = "^[0-9]{2}[-|/]+[0-9]{2}[-|/]+[0-9]{4}$";
            String born = sc.nextLine();

            String[] birthDay = born.split("-|/");
            String temp = birthDay[birthDay.length - 1];
            int age = YEAR_CURRENT - Integer.parseInt(temp);

            if (Regex.validate(REGEX_BORN, born)) {
                newStudent.setBirthday(String.valueOf(age));
                break;
            }
            System.err.println("Enter to repeat !");
        }

        while (true) {
            System.out.println("Enter the gender with format [0 | 1]");
            String REGEX_GEN = "^[0|1]+$";
            String gen = sc.nextLine();
            if (Regex.validate(REGEX_GEN, gen)) {
                newStudent.setGender(gen);
                break;
            }
            System.err.println("Enter to repeat !");
        }

        while (true) {
            System.out.println("Enter the address");
            String REGEX_ADDRESS = "^[A-Za-z0-9]+$";
            String add = sc.nextLine();
            if (Regex.validate(REGEX_ADDRESS, add)) {
                newStudent.setAddress(add);
                break;
            }
            System.err.println("Enter to repeat !");
        }

        while (true) {
            System.out.println("Enter the email with format [abc@abc.abc]");
            String REGEX_EMAIL = "^[a-z0-9]+@[a-z0-9]+[.]{1}[a-z]+$";
            String mail = sc.nextLine();
            if (Regex.validate(REGEX_EMAIL, mail)) {
                newStudent.setEmail(mail);
                break;
            }
            System.err.println("Enter to repeat !");
        }

        while (true) {
            System.out.println("Enter the mark");
            String REGEX_MARK = "^[0-9]+$";
            String mark = sc.nextLine();
            if (Regex.validate(REGEX_MARK, mark)) {
                newStudent.setMark(mark);
                break;
            }
            System.err.println("Enter to repeat !");
        }

        return newStudent;
    }

    public boolean checkIdOnly(List<Student> list, String id) {
        if (list.size() == 0) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).getId().equalsIgnoreCase(id)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void add(List<Student> list) throws IOException {
        System.out.println("Enter the quantity student");
        int quantity = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter at index " + (i + 1));
            list.add(input());
        }
        show(list);
        FileCSV.writer(FileCSV.FILE_PATH, list);
    }

    public int getIndexStudent(List<Student> list) {
        int index = 0;
        System.out.println("Enter the id");
        String id = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equalsIgnoreCase(id)) {
                index = i;
                return index;
            }
        }
        return -1;
    }

    @Override
    public void edit(List<Student> list) throws IOException {
        FileCSV.reader(FileCSV.FILE_PATH);
        int index = getIndexStudent(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(index, input());
            break;
        }
        show(list);
        FileCSV.writer(FileCSV.FILE_PATH, list);
    }

    @Override
    public void delete(List<Student> list) throws IOException {
        FileCSV.reader(FileCSV.FILE_PATH);
        int index = getIndexStudent(list);
        int choice;
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Are you really want to delete " + list.get(index).getName() + " ???" +
                    "\n1. YES" +
                    "\n2. NO");
            choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                list.remove(index);
                break;
            } else {
                break;
            }
        }
        show(list);
        FileCSV.writer(FileCSV.FILE_PATH, list);
    }

    @Override
    public void find(List<Student> list) {
        int index = getIndexStudent(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(index));
            break;
        }
    }

    @Override
    public void sort(List<Student> list) throws IOException {
        FileCSV.reader(FileCSV.FILE_PATH);
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getName().equals(o2.getName())) {
                    return o1.getBirthday().compareTo(o2.getBirthday());
                } else if (o1.getBirthday().equals(o2.getBirthday())) {
                    return o1.getMark().compareTo(o2.getMark());
                }
                return o1.getName().compareTo(o2.getName());
            }
        });
        FileCSV.writer(FileCSV.FILE_PATH, list);
    }

    @Override
    public void show(List<Student> list) {
        Iterator iterator = studentList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Override
    public void menu() throws IOException {
        int choice;
        do {
            System.out.println(
                    "***Menu***" +
                            "\n[[1 -> add]" +
                            " [2 -> edit]" +
                            " [3 -> delete]" +
                            " [4 -> find]" +
                            " [5 -> sort]" +
                            " [6 -> exit]]" +
                            "\nEnter your choice ?");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> add(studentList);
                case 2 -> edit(studentList);
                case 3 -> delete(studentList);
                case 4 -> find(studentList);
                case 5 -> sort(studentList);
                case 6 -> System.exit(6);
            }
        } while (choice != 0);
    }
}
