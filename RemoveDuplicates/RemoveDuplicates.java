package com.bayareala8s.RemoveDuplicates;

import java.util.HashSet;

public class RemoveDuplicates {

    public String removeDuplicates(String word)
    {

        char[] characters = word.toCharArray();

        HashSet<Character> characterSet = new HashSet<Character>();

        for(char ch: characters)
        {
            if(!characterSet.add(ch))
                continue;
        }
        return characterSet.toString();
    }
}
