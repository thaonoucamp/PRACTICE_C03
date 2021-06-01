package street.myFile;

import street.creat.Family;
import street.creat.Person;

import java.io.*;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class FileCSV {

    static public String FILE_CSV = "/Users/thaodangxuan/IdeaProjects/PRACTICE_C03/src/street/myFile/treet.csv";
    static public String FILE_OUT = "/Users/thaodangxuan/IdeaProjects/PRACTICE_C03/src/street/myFile/streetOutput.csv";
    public static ArrayList<Person> arrayList;

    public static void writerCSV(String path, List<Family> list) throws IOException {
        FileWriter fw = new FileWriter(new File(path));
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < list.size(); i++) {
            String homes = "";
            String members = "";
            homes += list.get(i).getIdHome() + "," + list.get(i).getQuantityMember() + members + "\n";
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
        String itemHome = null;
        while ((itemHome = br.readLine()) != null) {
            ArrayList<Person> members = new ArrayList<>();
            String[] home = itemHome.split(",");
            for (int i = 0; i < Integer.parseInt(home[1]); i++) {
                String[] member = br.readLine().split(",");
                Person person1 = new Person(Integer.parseInt(member[0]), member[1], Integer.parseInt(member[2]), member[3], member[4]);
                members.add(person1);
            }
            Family family = new Family(Integer.parseInt(home[0]), Integer.parseInt(home[1]), members);
            list.add(family);
        }
        return list;
    }
}
