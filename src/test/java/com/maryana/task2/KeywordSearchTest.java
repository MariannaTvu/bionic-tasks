package com.maryana.task2;

import org.junit.Test;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static com.maryana.task2.KeywordSearchRunner.countPresenceOfTheWord;

/**
 * Created by Maryana on 08.12.2016.
 */
public class KeywordSearchTest {
    @Test
    public void testSearch() throws Exception {
        List<Document> documents = new ArrayList<>();

        addTwoHolmesDocuments(documents);

        assertThat(countPresenceOfTheWord("Holmes", documents), is(2));
    }

    @Test
    public void emptySearchTest() throws Exception {
        List<Document> documents = new ArrayList<>();

        addTwoHolmesDocuments(documents);

        assertThat(countPresenceOfTheWord("echtgenoot", documents), is(0));
    }

    private void addTwoHolmesDocuments(List<Document> documents) {
        WikiArticle article = new WikiArticle();
        article.setTitle("Arthur Conan Doyle");
        article.setText("Doyle struggled to find a publisher for his work. His first work featuring Sherlock Holmes and Dr. Watson, A Study in Scarlet, was taken by Ward Lock & Co on 20 November 1886, giving Doyle £25 (£2500 today) for all rights to the story. The piece appeared one year later in the Beeton's Christmas Annual and received good reviews in The Scotsman and the Glasgow Herald.[9]");
        BookDescription doyleBookDescription = new BookDescription();
        doyleBookDescription.setTitle("The Hound of the Baskervilles");
        doyleBookDescription.setText("The cabman had described a somewhat shorter man, but such an impression might easily have been erroneous. How could I settle the point forever? Obviously the first thing to do was to see the Grimpen postmaster, and find whether the test telegram had really been placed in Barrymore’s own hands. Be the answer what it might, I should at least have something to report to Sherlock Holmes.");

        documents.add(article);
        documents.add(doyleBookDescription);
    }
}