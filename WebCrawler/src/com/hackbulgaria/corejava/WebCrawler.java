package com.hackbulgaria.corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {
    private static List<String> visited = new ArrayList<>();

    public static void crawl(URL url, String needle) throws IOException {
        visited.add(url.toString());
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String contents = "";
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            contents += inputLine + "\n";
        }
        if (contents.contains(needle)) {
            System.out.println(contents);
        } else {
            for (String link : getAllLinks(contents)) {
                if (!link.contains("index.html") && !link.contains("http://") && !link.contains("https://")) {
                    if (!visited.contains(new URL(url.toString() + link))) {
                        crawl(new URL(url.toString() + link), needle);
                        visited.add(url.toString() + link);
                    }
                }
            }
        }
        in.close();
    }

    private static List<String> getAllLinks(String content) {
        ArrayList<String> resultList = new ArrayList<>();
        String regex = "<a.*?href=\"((?!javascript).*?)\".*?>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            resultList.add(matcher.group(1));
        }
        return resultList;
    }

    public static void main(String[] args) throws Exception {

        URL url = new URL(args[0]);
        String needle = args[1];

        crawl(url, needle);
    }
}
