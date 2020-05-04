package com.bayareala8s.LongestSubStringParentheses;

import java.util.Stack;

public class App {

    public static void main(String[] args) {

        String str = ")()())";

        int k = longestValidParentheses(str);

        System.out.println("Longest valid parentheses length : " + k);

    }

    public static int longestValidParentheses(String s) {

        //Create a stack and push -1 as initial index to it
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(-1);

        // Initialize result
        int result = 0;

        //Traverse all characters of given string
        for(int i = 0; i < s.length(); i++) {

            //if opening bracket, push index of it
            if(s.charAt(i) == '(')
                stack.push(i);

            //if closing bracket i.e s.charAt(i) == ')'
            else {
                //Pop the previous opening bracket's index
                stack.pop();

                //check if this length formed with base of
                //current valid substring is more than max so far
                if(!stack.isEmpty())
                    result = Math.max(result, i - stack.peek());

                //if stack is empty, push current index as base
                // for next valid substring (if any)
                else
                    stack.push(i);
            }

        }
        return result;
    }
}

/*
Longest valid parentheses length : 4

Process finished with exit code 0
 */