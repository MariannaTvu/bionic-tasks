package com.maryana.task2;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maryana on 08.12.2016.
 */
public class BookDescription extends AbstractDocument implements Document {
    private List<String> authors = new ArrayList<>();
    private String publisher;
    private String annotation;

    public BookDescription() {
    }

    public BookDescription(URL link) {
        super(link);
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
}
