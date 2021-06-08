package structural.adapter;

import com.codegym.FileUtil;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileUtil fileUtil = new FileUtil();
        File file = new File("/Users/thaodangxuan/IdeaProjects/PRACTICE_C03/src/structural/adapter/file.numbers");
        long size = fileUtil.calculateSize(file);
        System.out.println(size);
    }
}