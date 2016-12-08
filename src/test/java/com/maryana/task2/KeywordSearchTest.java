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
        URL firstUrl = new URL("https://en.wikipedia.org/wiki/Hawaiian_Music_Hall_of_Fame");
        WikiArticle firstArticle = new WikiArticle(firstUrl);

        URL secondUrl = new URL("https://ru.wikipedia.org/wiki/%D0%93%D0%B5%D1%85%D0%B0%D1%80%D0%BA%D1%83%D0%BD%D0%B8%D0%BA%D1%81%D0%BA%D0%B0%D1%8F_%D0%BE%D0%B1%D0%BB%D0%B0%D1%81%D1%82%D1%8C");
        WikiArticle secondArticle = new WikiArticle(secondUrl);

        documents.add(firstArticle);
        documents.add(secondArticle);

        assertThat(countPresenceOfTheWord("Гехаркуникская", documents), is(1));
    }
}