package com.bayareala8s.CountDuplicateCharacters;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        String word = "abcdefgaaaa";

        DuplicateCharacters dup = new DuplicateCharacters();
        HashMap<Character,Integer> dupCount = dup.getDuplicateCharacters(word);

        for(Map.Entry<Character,Integer> entryset: dupCount.entrySet()) {

            System.out.println("Character: " + entryset.getKey() + " has duplicates " + entryset.getValue());
        }
    }
}
