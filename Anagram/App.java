package com.bayareala8s.Anagram;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter word1");
        String word1 = scan.next();

        System.out.println("Enter word2");
        String word2 = scan.next();

        CheckAnagram anagram = new CheckAnagram();

        if(anagram.isAnagram(word1,word2)) {
            System.out.println("Words are anagrams");
        }
        else {
            System.out.println("Words are not anagrams");
        }
    }
}
