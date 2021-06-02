package string_regex;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class News {
    private static final String URL_PATH = "https://dantri.com.vn/the-gioi.htm";
    private static final String REGEX = ">(.*?)</a>";

    public static void main(String[] args) throws IOException {
        // 1 - tao URL;
        URL url = new URL(URL_PATH);
        // 2 - mo stream de doc;
        Scanner sc = new Scanner(new InputStreamReader(url.openStream()));
        // 3 - ghi cho den ky tu cuoi cung;
        sc.useDelimiter("\\Z");
        String content = sc.next();
        sc.close();
        // 4 - cat noi dung (/n + ",");
//        content = content.replaceAll("\\n+", "");
        System.out.println(content);
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(content);
        // 5- in noi dung;
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
