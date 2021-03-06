package string_regex;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawl {
    private static final String PATH = "https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html";

    public static void main(String[] args) throws IOException {
        // 1- nhan vao url;
        URL url = new URL(PATH);
        // 2- mo tream va dua vao input stream;
        Scanner sc = new Scanner(new InputStreamReader(url.openStream()));
        // 3- ghi den ky tu cuoi cung;
        sc.useDelimiter("\\Z");
        String content = sc.next();
        sc.close();
        // 4- cat noi dung lay duoc(/n + ',');
        content = content.replaceAll("\\n+", " ");
        // 5- loc noi dung;
        Pattern pattern = Pattern.compile("name_song\">(.*?)</a>");
        Matcher matcher = pattern.matcher(content);
        // 6- in noi dung;
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
