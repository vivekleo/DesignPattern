package com.firstDesignPattern.stratergy.improved;

import com.firstDesignPattern.stratergy.improved.fly.FlyBehaviour;
import com.firstDesignPattern.stratergy.improved.quack.QuackBehaviour;

//OO basics - Abstraction, Encapsulation, Polymorphism, Inheritance. 
public abstract class Duck {
    //Has a relationship is better than Is A.Favour composition over inheritance.
    //Program to interface not implementation
    //can add getters and setters for these behaviour giving client flexibility to change the behaviour.
    private final FlyBehaviour flyBehaviour;
    private final QuackBehaviour quackBehaviour;

    public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public void quack() {
        System.out.println(display() + quackBehaviour.quack());
    }

    public void swim() {
        System.out.println(display() + " Swim");
    }

    public void fly() {
        System.out.println(display() + flyBehaviour.fly());
    }

    public String display() {
        return getClass().getSimpleName();
    }

}
