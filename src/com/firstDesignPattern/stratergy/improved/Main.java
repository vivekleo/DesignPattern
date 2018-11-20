package com.firstDesignPattern.stratergy.improved;

import java.util.Arrays;
import java.util.List;

//Strategy pattern defines family of algorithms, encapsulated each one and make them interchangeable.
//Strategy lets the algorithm vary independently from client Using It.
public class Main {
    public static void main(String[] args) {
        Duck[] d = new Duck[]{new MallardDuck(), new MarbledDuck(), new RubberDuck()};
        List<Duck> duckList = Arrays.asList(d);
        duckList.forEach(duck -> {
            duck.swim();
            duck.quack();
            duck.fly();
        });
    }
}
