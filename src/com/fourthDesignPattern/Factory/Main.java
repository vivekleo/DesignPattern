package com.fourthDesignPattern.Factory;

import com.fourthDesignPattern.Factory.pizza.Pizza;
import com.fourthDesignPattern.Factory.pizzaStore.NY.NYPizzaStore;
import com.fourthDesignPattern.Factory.pizzaStore.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore(); //type of pizza store.
        Pizza pizza = pizzaStore.orderPizza("Cheese"); //use store to fulfill order
        System.out.println(pizza.getName());
    }
}

/**
 * Factory pattern- defines an interface for creating an object, but lets subclasses decide which class to instantiate.
 * Factory method lets a class defer instantiation to subclasses.
 * <p>
 * Note:
 * Reducing dependencies to concrete classes is a good thing.
 * <p>
 * Dependency Inversion Principle-Depend on abstractions do not depend on concrete classes.
 * <p>
 * Pizza Store Depend on Pizza. (Pizza is abstraction).
 * Concrete pizza classes depend on the pizza abstraction too, because they extend Pizza.
 */
