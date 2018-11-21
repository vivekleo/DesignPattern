package com.fifthDesignPattern.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance();
                System.out.println(singleton);
            }
        });
        t.start();
    }
}

/**
 * Singleton pattern ensures that a class can have only one instance, and provides a global point of access to it.
 */
