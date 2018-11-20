package com.fourthDesignPattern.AbstractFactory;

import com.fourthDesignPattern.AbstractFactory.pizza.Pizza;
import com.fourthDesignPattern.AbstractFactory.pizzaStore.NY.NYPizzaStore;
import com.fourthDesignPattern.AbstractFactory.pizzaStore.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore(); //type of pizza store.
        Pizza pizza = pizzaStore.orderPizza("Cheese"); //use store to fulfill order
        System.out.println(pizza.getName());
    }
}

/**
 * Abstract Factory pattern- provides as interface for creating families of related or dependent objects without specifying their concrete classes.
 * Depend on abstractions. Do not depend on concrete classes.
 **/
