package street.myFile;

import street.creat.Family;
import street.creat.Person;

import java.io.*;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class FileCSV {
    static public String FILE_CSV = "/Users/thaodangxuan/IdeaProjects/PRACTICE_C03/src/street/myFile/street.csv";

    public static void writerCSV(String path, List<Family> list) throws IOException {
        FileWriter fw = new FileWriter(new File(path));
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < list.size(); i++) {
            String homes = "";
            String members = "";
            homes += list.get(i).getIdHome() + "," + members + "\n";
            bw.write(homes);
            for (int j = 0; j < list.get(i).getListMembers().size(); j++) {
                members += list.get(i).getListMembers().get(j).getId()
                        + "," + list.get(i).getListMembers().get(j).getName()
                        + "," + list.get(i).getListMembers().get(j).getAge()
                        + "," + list.get(i).getListMembers().get(j).getGender()
                        + "," + list.get(i).getListMembers().get(j).getJob() + "\n";
            }
            bw.write(members);
        }
        bw.close();
        fw.close();
    }

    public static List<Family> reader(String content) throws IOException {
        List<Family> list = new ArrayList<>();
        FileReader fileReader = new FileReader(content);
        BufferedReader br = new BufferedReader(fileReader);
        String item = null;
        int idHome = 0;
        int quantity = 0;
        Member members;
        while ((item = br.readLine()) != null) {
            String[] home = item.split(",");
            list.add(new Family(home[0], home[1], new ArrayList<Person>().add(new Person(home[2], home[3], Integer.parseInt(home[4]), Integer.parseInt(home[5]), home[6]))));
        }
        return list;
    }
}
