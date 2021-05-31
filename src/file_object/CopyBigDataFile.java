package file_object;

import java.io.*;

public class CopyBigDataFile {
   static String FILE_SOURCE = "/Users/thaodangxuan/IdeaProjects/PRACTICE_C03/src/file_object/file_source";
   static String FILE_COPY = "/Users/thaodangxuan/IdeaProjects/PRACTICE_C03/src/file_object/file_copy";
    private static void copyFile(File source, File desk) throws IOException {
        InputStream is = new FileInputStream(source);
        OutputStream os = new FileOutputStream(desk,true);

        byte[] bytes = new byte[1024];
        int length;

        if ((length = is.read(bytes)) > 0) {

            System.out.println(length);
            os.write(bytes, 0, length);
        }
        is.close();
        os.close();
    }

    public static void main(String[] args) throws IOException {
        copyFile(new File(FILE_SOURCE), new File(FILE_COPY));
    }
}
