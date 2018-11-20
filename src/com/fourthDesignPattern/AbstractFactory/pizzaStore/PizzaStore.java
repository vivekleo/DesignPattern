package com.fourthDesignPattern.AbstractFactory.pizzaStore;

import com.fourthDesignPattern.AbstractFactory.pizza.Pizza;

/**
 * Abstract creator class, defines abstract factory method that subclasses implement to produce objects.
 * <p>
 * Creator code depends on abstract product, which is produced by a subclass.
 * Creator never really knows which product was produced.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.bake();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);

    //Factory method is abstract so subclasses are counted on handle object creation.
    /**
     * Pizza- factory method creates a product that is typically used within methods defined in super classes.
     * createPizza- factory method isolates the client from knowing what kind of concrete product is actually created.
     * type- select among several variant of the product.
     */
}
