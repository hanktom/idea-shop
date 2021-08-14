package com.tom.web;

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

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
