package com.bayareala8s.CountDuplicateCharacters;

import java.util.HashMap;

public class DuplicateCharacters {

    public HashMap<Character,Integer> getDuplicateCharacters(String word) {

        HashMap<Character,Integer> characterMap = new HashMap<Character, Integer>();

        char[] characters = word.toCharArray();

        for(char ch: characters) {

            if(characterMap.containsKey(ch)) {
                characterMap.put(ch, characterMap.get(ch) + 1);
            }
            else {
                characterMap.put(ch,1);
            }

        }

        return characterMap;
    }
}
