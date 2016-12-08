package com.maryana.task2;

import java.io.*;
import java.net.URL;

/**
 * Created by Maryana on 08.12.2016.
 */
public class WikiArticle extends AbstractDocument implements Document {
    URL link;

    public WikiArticle() {
    }

    public WikiArticle(URL link) {
        super(link);
        this.link = link;
    }
}
