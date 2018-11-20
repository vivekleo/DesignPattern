package com.fourthDesignPattern.AbstractFactory.pizza.Cheese;

import com.fourthDesignPattern.AbstractFactory.PizzaIngredient.PizzaIngredientFactory;
import com.fourthDesignPattern.AbstractFactory.pizza.Pizza;

/**
 * Makes Cheese Pizza
 */
public class CheesePizza extends Pizza {
    private final PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        name = "CheesePizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing: " + name);
        dough = pizzaIngredientFactory.createDough(); //Magic happens here.
        sauce = pizzaIngredientFactory.createSauce();
        toppings.add("Grated Regganio cheesse");
        super.prepare();

        /**
         * sauce = pizzaIngredientFactory.createSauce();
         * sauce- We are setting the Pizza instance variable to refer to specific sauce used in pizza.
         * pizzaIngredientFactory- Pizza doesnot care which ingredient factory is used as long as it is IngredientFactory.
         * createSauce- Returns Sauce, if it is NYPizzaIngredientFactory, MarinaraSauce will be returned.
         */
    }
}
