package street.myFile;

import street.creat.Family;
import street.creat.Person;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileText {
    public String FILE_PATH = "/Users/thaodangxuan/IdeaProjects/PRACTICE_C03/src/street/myFile/treet.dat";

    public void writer(List<Family> list) throws IOException {
        File file = new File(FILE_PATH);

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(list);
        objectOutputStream.flush();

        objectOutputStream.close();
        fileOutputStream.close();
    }

    public ArrayList<Family> reader() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(FILE_PATH);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        ArrayList list = (ArrayList<Family>) objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();

        return list;
    }
}
