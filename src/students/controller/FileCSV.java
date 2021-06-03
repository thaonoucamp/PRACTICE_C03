package students.controller;

import students.sever.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCSV {
    public static final String FILE_PATH = "/Users/thaodangxuan/IdeaProjects/PRACTICE_C03/src/students/controller/file_student_csv";

    public static void writer(String filePath, List<Student> list) throws IOException {
        FileWriter fw = new FileWriter(new File(filePath));
        BufferedWriter bw = new BufferedWriter(fw);
        for (Student student :
                list) {
            bw.write(student.getId() + "," + student.getName()
                    + "," + student.getBirthday() + "," + student.getGender()
                    + "," + student.getAddress() + "," + student.getEmail()
                    + "," + student.getMark() + "\n");
        }
        bw.close();
        fw.close();
    }

    public static List<Student> reader(String filePath) throws IOException {
        List<Student> list = new ArrayList<>();
        FileReader fr = new FileReader(new File(filePath));
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        while (((line = br.readLine()) != null)) {
            String[] student = line.split(",");
            list.add(new Student(student[0], student[1], student[2], student[3], student[4], student[5], student[6]));
        }
        return list;
    }
}
