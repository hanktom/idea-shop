package com.tom.web;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class WebRunner {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.coolpc.com.tw/evaluate.php");
            InputStream is = url.openStream();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(is, "big5"));
            StringBuilder sb = new StringBuilder();
            String line = in.readLine();
            while(line != null) {
                sb.append(line);
                sb.append("\n");
                line = in.readLine();
            }
            System.out.println(sb.toString());
            //Parsing HTML
            Document doc = Jsoup.parse(sb.toString());
            //OPTGROUP LABEL='NVIDIA RTX3090'
            Elements elements = doc.select("OPTGROUP[LABEL=NVIDIA RTX3090]");
            System.out.println(elements.size());
            for (Element element : elements) {
//                System.out.println(element.text());
                Elements options = element.select("OPTION");
                for (Element option : options) {
                    boolean disabled = option.hasAttr("disabled");
                    if (!disabled) {
                        System.out.println(option.text());
                    }
                }
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
