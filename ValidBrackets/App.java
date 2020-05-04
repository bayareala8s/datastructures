package com.bayareala8s.ValidBrackets;

import java.util.HashMap;
import java.util.Stack;

public class App {

    public static void main(String[] args) {

        String s = "[{()}]]]]]]";

        if(isValid(s))
            System.out.println(s + " is a valid brackets string");
        else
            System.out.println(s + " is a NOT a valid brackets string");


    }

    public static boolean isValid(String s) {

        if(s.length() % 2 != 0)
            return false;

        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<Character>();

        for(char c: s.toCharArray()) {

            if (map.keySet().contains(c)) {

                stack.push(c); //opening braces goes on stack
            }
            else if (map.values().contains(c)) {

                if (!stack.empty() && map.get(stack.peek()) == c) {

                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

/*
[{()}] is a valid brackets string

Process finished with exit code 0
 */

/*
[{()}]]]]]] is a NOT a valid brackets string

Process finished with exit code 0
 */