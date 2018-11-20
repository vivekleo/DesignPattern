package com.fourthDesignPattern.Factory.pizza.Chicago;

import com.fourthDesignPattern.Factory.pizza.Pizza;

/**
 * Concrete product.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Sauce and Cheese Pizza";
        dough = "Extra thich crust dough";
        sauce = "Plum tomatto Sauce";
        toppings.add("Shredded Mozzarella cheesse");
    }

    //override cut method so pizza can be cut into square slices.
    @Override
    public void cut() {
        System.out.println("Cut the pizza into square slices");
    }
}
