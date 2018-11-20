package com.fourthDesignPattern.Factory.pizza.NY;

import com.fourthDesignPattern.Factory.pizza.Pizza;

/**
 * Concrete product.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NYStyle Sauce and Cheese Pizza";
        dough = "Thin crust dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Regganio cheesse");
    }
}
