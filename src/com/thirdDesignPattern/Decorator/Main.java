package com.thirdDesignPattern.Decorator;

import com.thirdDesignPattern.Decorator.Condiments.Milk;
import com.thirdDesignPattern.Decorator.Condiments.Mocha;
import com.thirdDesignPattern.Decorator.beverage.Beverage;
import com.thirdDesignPattern.Decorator.beverage.DarkRoast;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}


/**
 * Real work Decorators are Java I/O.
 * <p>
 * FileInputStream-Is a component that is being decorated. Read bytes from file Object.
 * <p>
 * BufferedInputStream-Is a concrete decorator. Does two things
 * 1. It buffers input to improve performance.
 * 2. Adds method readLine() for reading character based input a line at a time
 * <p>
 * LineNumberInputStream- concrete decorator
 * Adds ability to count the number of lines as it reads data.
 */
