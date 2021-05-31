package street.myFile;

import street.creat.Family;
import street.creat.Person;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileObj {
    public static String FILE_OBJ = "/Users/thaodangxuan/IdeaProjects/PRACTICE_C03/src/street/myFile/treet.dat";

    public static void writer(String path, List<Family> list) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        for (int i = 0; i < list.size(); i++) {
            objectOutputStream.writeObject(list);
        }

        objectOutputStream.flush();

        objectOutputStream.close();
        fileOutputStream.close();
    }

    public static ArrayList<Family> reader(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        ArrayList list = (ArrayList<Family>) objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();

        return list;
    }
}
