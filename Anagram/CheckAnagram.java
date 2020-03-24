package com.bayareala8s.Anagram;

import java.util.Arrays;

public class CheckAnagram {

    public boolean isAnagram(String word1, String word2) throws Exception {

        if(word1.isEmpty() || word2.isEmpty()) {
            throw new Exception("word1 or word2 is empty");
        }

        if(word1.length() != word2.length()) {
            return false;
        }

        char[] word1charArray = word1.toCharArray();
        char[] word2charArray = word2.toCharArray();

        Arrays.sort(word1charArray);
        Arrays.sort(word2charArray);

        if(new String(word1charArray).equals(new String(word2charArray))) {
            return true;
        }
        else {
            return false;
        }
    }
}
