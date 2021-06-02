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
        // nhan vao url;
        URL url = new URL(PATH);
        // mo tream va dua vao input stream;
        Scanner sc = new Scanner(new InputStreamReader(url.openStream()));
        // ghi den ky tu cuoi cung;
        sc.useDelimiter("\\Z");

        String content = sc.next();
        sc.close();

        // xoa cac dong trong content lay duoc;
        content = content.replaceAll("\\n+", " ");
        // loc noi dung va in danh sach bai hat;
        Pattern pattern = Pattern.compile("name_song\">(.*?)</a>");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
