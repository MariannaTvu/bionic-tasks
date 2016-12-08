package com.maryana.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maryana on 08.12.2016.
 */
public class BookDescription implements Document {
    private List<String> authors = new ArrayList<>();
    private String title;
    private String publisher;
    private String annotation;
    private String text;

    public BookDescription(URL link) {
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

    public BookDescription setAuthors(List<String> authors) {
        this.authors = authors;
        return this;
    }

    public BookDescription setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public BookDescription setAnnotation(String annotation) {
        this.annotation = annotation;
        return this;
    }


    @Override
    public boolean containsWord(String word) {
        return text.contains(word) || title.contains(word);
    }
}
