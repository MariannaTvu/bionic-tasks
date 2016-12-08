package com.maryana.task2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 2.	An array of the following objects is given:
 * -	book description (author(s), title, publisher, annotation, text)
 * -	article (author(s), title, journal name, year, N, text)
 * -	wiki article (link, title, text)
 * Find how many objects contains given key words in titles and/or texts
 */
public class KeywordSearchRunner {
    public static void main(String[] args) throws MalformedURLException {
        List<Document> documents = new ArrayList<>();

        URL articleUrl = new URL("http://biomarkerres.biomedcentral.com/articles/10.1186/s40364-016-0075-2");
        Article article = new Article(articleUrl);

        URL wikiUrl = new URL("https://en.wikipedia.org/wiki/Isothermal_microcalorimetry");
        WikiArticle wikiArticle = new WikiArticle(wikiUrl);

        URL bookUrl = new URL("http://www.textfiles.com/etext/AUTHORS/DOYLE/doyle-his-382.txt");
        BookDescription bookDescription = new BookDescription(bookUrl);

        documents.add(article);
        documents.add(wikiArticle);
        documents.add(bookDescription);

        System.out.println("The word 'Watson' occurs " + countPresenceOfTheWord("Watson", documents) + " time(s)");
        System.out.println("The word 'schistosomula' occurs " + countPresenceOfTheWord("schistosomula", documents) + " time(s)");
    }

    public static int countPresenceOfTheWord(String word, List<Document> documents) {
        int count = 0;
        for (Document document : documents) {
            if (document.containsWord(word)) {
                count++;
            }
        }
        return count;
    }

    public static Predicate<Document> containsWord(String word) {
        return p -> p.containsWord(word);
    }
}




