package com.maryana.task2;

import java.net.URL;

/**
 * Created by Maryana on 08.12.2016.
 */
public class Article extends AbstractDocument implements Document {

    private String journal;
    private String name;
    private int year;
    private String N;

    public Article() {
    }

    public Article(URL link) {
        super(link);
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


}
