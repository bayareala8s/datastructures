package com.bayareala8s.CheckPermutation;

public class App {

    public static void main(String[] args) {

        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        CheckPermutation checkPermutation = new CheckPermutation();

        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = checkPermutation.permutation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + anagram);
        }
    }
}
