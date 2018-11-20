package com.fourthDesignPattern.Factory.pizzaStore.NY;

import com.fourthDesignPattern.Factory.pizza.NY.NYStyleCheesePizza;
import com.fourthDesignPattern.Factory.pizza.Pizza;
import com.fourthDesignPattern.Factory.pizzaStore.PizzaStore;

/**
 * Encapsulates how NY style pizza are created.
 * Factory is key to encapsulate this knowledge.
 */
public class NYPizzaStore extends PizzaStore {
    /**
     * It is factory method. Produces objects of type Pizza
     *
     * @param type
     * @return
     */
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("Cheese")) {
            return new NYStyleCheesePizza();
        }
        return null;
    }
}
