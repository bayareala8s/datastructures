package com.bayareala8s.MaxItemStack;

public class App {

    public static void main(String[] args) {

        MaxItemStack maxItemStack = new MaxItemStack();

        maxItemStack.push(10);
        maxItemStack.push(5);
        maxItemStack.push(1);
        maxItemStack.push(12);
        maxItemStack.push(11);

        System.out.println("Maximum item in stack is: " + maxItemStack.getMaxItem());

    }
}

/*
Maximum item in stack is: 12

Process finished with exit code 0
 */