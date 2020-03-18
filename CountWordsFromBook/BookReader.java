package com.bayareala8s.CountWordsFromBook;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BookReader implements IReader{

    String bookName;

    BookReader(String book) {
        this.bookName = book;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public int countWords(String bookName) throws IOException {

        BufferedReader fileReader = new BufferedReader(new FileReader(bookName));

        String line = "";
        int count = 0;
        while((line = fileReader.readLine()) != null) {
            String[] words = line.split(" ");
            count = count + words.length;
        }

        return count;
    }
}
