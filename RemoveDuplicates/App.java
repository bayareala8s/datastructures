package com.bayareala8s.RemoveDuplicates;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String[] words;
        int size;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of words");
        size = scan.nextInt();

        words = new String[size];

        RemoveDuplicates duplicates = new RemoveDuplicates();

        for (String word : words) {

            System.out.println("Enter word to get unique characters");
            word = scan.next();
            String modifiedString = duplicates.removeDuplicates(word);

            System.out.println("Unique characters: " + modifiedString);
        }


    }
}
