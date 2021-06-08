package structural.adapter;

import com.codegym.FileUtil;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileUtil fileUtil = new FileUtil();
        String FILE_PATH = "/Users/thaodangxuan/IdeaProjects/PRACTICE_C03/src/structural/adapter/file.numbers";
        FileCalculator fileCalculator = new Adapter();
        Client client = new Client(fileCalculator);
        client.printSize(FILE_PATH);
    }
}