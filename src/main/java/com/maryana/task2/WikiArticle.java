package com.maryana.task2;

import java.io.*;
import java.net.URL;

/**
 * Created by Maryana on 08.12.2016.
 */
public class WikiArticle implements Document {
    String title;
    String text;
    URL link;

    public WikiArticle(URL link) {
        this.link = link;
        this.title = link.getFile();
        StringBuilder sb = new StringBuilder();
        BufferedReader in = null;
        try {
            in = new BufferedReader(
                    new InputStreamReader(link.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        text = sb.toString();
    }


    @Override
    public boolean containsWord(String word) {
        return text.contains(word) || title.contains(word);
    }
}
