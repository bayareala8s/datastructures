package com.bayareala8s.CheckPermutation;

import java.util.Arrays;

public class CheckPermutation {

    public boolean permutation(String s, String t) {

        return sort(s).equals(sort(t));
    }

    private String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}
