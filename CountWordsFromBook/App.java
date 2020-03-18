package com.bayareala8s.CountWordsFromBook;

import java.io.BufferedReader;
import java.io.FileReader;

public class App {

    public static void main(String[] args) throws Exception {

        String book = "src/com/bayareala8s/CountWordsFromBook/book.dat";
        int wordCount = 0;

        BookReader br = new BookReader(book);
        wordCount = br.countWords(book);

        System.out.println("Book " + book + " has number of words : " + wordCount);
    }
}
