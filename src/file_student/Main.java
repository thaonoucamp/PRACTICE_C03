package file_student;

import java.io.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Student> list = new ArrayList<>();

    String FILE_PATH = "/Users/thaodangxuan/IdeaProjects/PRACTICE_C03/src/file_student/student.dat";

    public void writer(String filePath, ArrayList<Student> list) throws IOException {
        FileOutputStream fos = new FileOutputStream(filePath);
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(list);
    }

    public ArrayList<Student> reader(String filePath) throws IOException, ClassNotFoundException {
        ArrayList<Student> list = new ArrayList<>();

        FileInputStream fis = new FileInputStream(filePath);
        ObjectInputStream ois = new ObjectInputStream(fis);
        list = (ArrayList<Student>) ois.readObject();
        
        return list;
    }

    public static void main(String[] args) {
        list.add(new Student("a", "1", "DA NANG"));
        list.add(new Student("b", "2", "HA NOI"));
        list.add(new Student("c", "3", "HO CHI MINH"));
        list.add(new Student("d", "4", "HA TAY"));
        list.add(new Student("e", "5", "HUE"));
    }
}
