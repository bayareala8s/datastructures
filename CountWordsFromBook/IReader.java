package com.bayareala8s.CountWordsFromBook;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IReader {

    public int countWords(String bookName) throws IOException;

}
