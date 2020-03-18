package com.bayareala8s.MinItemStack;

public class App {

    public static void main(String[] args) {

        MinItemStack minItemStack = new MinItemStack();
        minItemStack.push(10);
        minItemStack.push(5);
        minItemStack.push(11);
        minItemStack.push(12);
        minItemStack.push(11);

        System.out.println(minItemStack.getMinItem());
    }
}
