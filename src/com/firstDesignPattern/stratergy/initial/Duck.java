package com.firstDesignPattern.stratergy.initial;

public abstract class Duck {

    public void quack() {
        System.out.println(display() + " Quack");
    }

    public void swim() {
        System.out.println(display() + " Swim");
    }

    public void fly() {
        System.out.println(display() + " Fly");
    }

    public String display() {
        return getClass().getSimpleName();
    }

}
