package street.myFile;

import street.creat.Family;
import street.creat.Person;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileText {
   public String FILE_PATH = "/Users/thaodangxuan/IdeaProjects/PRACTICE_C03/src/street/myFile/treet.txt";

    public void writer(String filePath) throws IOException {
        File file = new File(FILE_PATH);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write((new Person("1", "nam", 2,29, "IT")).toString().getBytes(StandardCharsets.UTF_8));
    }

}
