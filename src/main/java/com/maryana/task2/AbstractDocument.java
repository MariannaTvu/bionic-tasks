package com.maryana.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by Maryana on 08.12.2016.
 */
public abstract class AbstractDocument implements Document{
    public String title;
    public String text;

    public AbstractDocument (URL link) {
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

    public AbstractDocument() {
    }

    public AbstractDocument setTitle(String title) {
        this.title = title;
        return this;
    }

    public AbstractDocument setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public boolean containsWord(String word) {
        return text.contains(word) || title.contains(word);
    }
}
