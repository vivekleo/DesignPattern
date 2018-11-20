package com.fourthDesignPattern.AbstractFactory.PizzaIngredient;

import com.fourthDesignPattern.AbstractFactory.PizzaIngredient.ingredient.dough.Dough;
import com.fourthDesignPattern.AbstractFactory.PizzaIngredient.ingredient.sauce.Sauce;

/**
 * Factory defines interface that all concrete factories must implement, which consists of set of methods for producing products.
 */
public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();
}
