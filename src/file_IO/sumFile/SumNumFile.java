package file_IO.sumFile;

import java.io.*;
import java.util.ArrayList;

public class SumNumFile {
    static ArrayList<Integer> list = new ArrayList<>();
    static String FILE_PATH = "/Users/thaodangxuan/IdeaProjects/PRACTICE_C03/src/file_IO/sumFile/file_number";
    static String FILE_COPY = "/Users/thaodangxuan/IdeaProjects/PRACTICE_C03/src/file_IO/sumFile/file_coppy";

    public static ArrayList<Integer> reader(String filePath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String number = null;

        while ((number = bufferedReader.readLine()) != null) {
            list.add(Integer.parseInt(number));
            System.out.println(number);
        }
        bufferedReader.close();

        return list;
    }

    public static void writer(String fileCopy) throws IOException {
        FileWriter fileWriter = new FileWriter(new File(fileCopy));
        for (int i : list) {
            fileWriter.write(i + "\n");
        }
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        reader(FILE_PATH);
        writer(FILE_COPY);
        System.out.println(FILE_PATH.length());
    }
}