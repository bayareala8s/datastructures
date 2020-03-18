package com.bayareala8s.UniqueCharacters;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

            String[] words;
            int size;

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number of words to check");
            size = scan.nextInt();

            words = new String[size];
            UniqueChars uniquechars = new UniqueChars();

            for (String word : words) {

                System.out.println("Enter word to check for uniqueness");
                word = scan.next();
                System.out.println(word + ": " + uniquechars.isUniqueChars(word));
            }
    }
}
