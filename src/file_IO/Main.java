package file_IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static String FILE_PATH = "/Users/thaodangxuan/IdeaProjects/PRACTICE_C03/src/file_IO/text.csv";

    public void printCountry(ArrayList<String> list) {
        System.out.println("Country [id = " + list.get(0)
                + "code = " + list.get(1)
                + "name = " + list.get(2)
                + "]");
    }

    public ArrayList<String> swapCSV(String content) {
        ArrayList<String> listCSV = new ArrayList<>();

        String[] item = content.split(",");
        for (int i = 0; i < item.length; i++) {
            listCSV.add(item[i]);
        }
        return listCSV;
    }

    public static void main(String[] args) throws IOException {
        List<Country> list = new ArrayList<>();

        list.add(new Country(2, "TL", "Thailand"));
        list.add(new Country(3, "TQ", "China"));
        list.add(new Country(4, "EL", "England"));
        list.add(new Country(1, "VN", "Vietnam"));
        writerCSV(list);

        reader();

    }

    private static ArrayList<Country> reader() throws IOException {
        ArrayList<Country> list = new ArrayList<>();

        FileReader fileReader = new FileReader(new File(FILE_PATH));
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            String[] item = line.split(",");
            for (int i = 0; i < item.length; i++) {
                list.add(new Country(Integer.parseInt(item[0]), item[1], item[2]));
            }
        }
        return list;
    }

    private static void writerCSV(List<Country> list) throws IOException {
        File file = new File(FILE_PATH);
        FileWriter fileWriter = new FileWriter(file);
        for (int i = 0; i < list.size(); i++) {
            fileWriter.write(list.get(i).toString() + "\n");
//            fileWriter.write(list.get(i).getId() + "," + list.get(i).getCode() + "," + list.get(i).getName() + "\n");
        }
        fileWriter.close();
    }
}
