package com.bayareala8s.multithreading;

public class App {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new StartThread());
        Thread thread2 = new Thread(new StartThread());
        thread1.start();
        thread2.start();
    }
}
