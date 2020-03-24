package com.bayareala8s.multithreading;

public class NewThread implements Runnable {

    String name; // name of thread
    Thread thread;

    NewThread(String threadName) {
        name = threadName;
        thread = new Thread(this, name);
        System.out.println("New thread: " + thread);
        thread.start(); // Start the thread
    }

    // This is the entry point for thread.
    @Override
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}

