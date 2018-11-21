package com.fifthDesignPattern.Singleton;

public class Singleton {
    private volatile static Singleton uniqueInstance;
    //Volatile ensures that multiple threads handle the uniqueInstance variable correctly when it is initialized to Singleton Instance.

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
