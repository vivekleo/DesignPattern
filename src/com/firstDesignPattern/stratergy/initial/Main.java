package com.firstDesignPattern.stratergy.initial;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Duck[] d = new Duck[]{new MallardDuck(), new MarbledDuck()};
        List<Duck> duckList = Arrays.asList(d);
        duckList.forEach(duck -> {
            duck.swim();
            duck.quack();
        });
    }
}
