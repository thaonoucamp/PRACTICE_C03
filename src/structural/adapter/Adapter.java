package structural.adapter;

import com.codegym.FileUtil;

import java.io.File;

public class Adapter implements FileCalculator {
    @Override
    public long calculatorSize(String path) {
        FileUtil fileUtil = new FileUtil();
        File file = new File(path);
        return fileUtil.calculateSize(file);
    }
}
