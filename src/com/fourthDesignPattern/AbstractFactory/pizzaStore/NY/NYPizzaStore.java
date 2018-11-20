package com.fourthDesignPattern.AbstractFactory.pizzaStore.NY;


import com.fourthDesignPattern.AbstractFactory.PizzaIngredient.NY.NYPizzaIngredientFactory;
import com.fourthDesignPattern.AbstractFactory.PizzaIngredient.PizzaIngredientFactory;
import com.fourthDesignPattern.AbstractFactory.pizza.Cheese.CheesePizza;
import com.fourthDesignPattern.AbstractFactory.pizza.Pizza;
import com.fourthDesignPattern.AbstractFactory.pizzaStore.PizzaStore;

/**
 * Encapsulates how NY style pizza are created.
 * Factory is key to encapsulate this knowledge.
 * NYPizza store identifies NY Pizza ingredient.
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
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza = null;
        if (type.equals("Cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        return pizza;
    }
}
