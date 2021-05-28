package file_IO.sumFile;

import java.io.*;

public class SumNumFile {
    private static String FILE_PATH = "/Users/thaodangxuan/IdeaProjects/PRACTICE_C03/src/file_IO/sumFile/file_number";

    public static void reader() throws IOException {
        FileReader fileReader = new FileReader(new File(FILE_PATH));
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String number = null;
        int total = 0;
        while ((number = bufferedReader.readLine()) != null) {
            total += Integer.parseInt(number);
        }
        System.out.println("sum = " + total);
        fileReader.close();
    }

    public static void main(String[] args) throws IOException {
        reader();
    }
}
