package com.maryana.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by Maryana on 08.12.2016.
 */
public class Article implements Document {
    private String title;
    private String journal;
    private String name;
    private int year;
    private String N;
    private String text;

    public Article(URL link) {
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

    public Article setN(String n) {
        N = n;
        return this;
    }

    public Article setYear(int year) {
        this.year = year;
        return this;
    }

    public Article setJournal(String journal) {
        this.journal = journal;
        return this;
    }

    public Article setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public boolean containsWord(String word) {
        return text.contains(word) || title.contains(word);
    }
}
