package com.fourthDesignPattern.AbstractFactory.PizzaIngredient.NY;

import com.fourthDesignPattern.AbstractFactory.PizzaIngredient.PizzaIngredientFactory;
import com.fourthDesignPattern.AbstractFactory.PizzaIngredient.ingredient.dough.Dough;
import com.fourthDesignPattern.AbstractFactory.PizzaIngredient.ingredient.dough.ThinCrust;
import com.fourthDesignPattern.AbstractFactory.PizzaIngredient.ingredient.sauce.MarinaraSauce;
import com.fourthDesignPattern.AbstractFactory.PizzaIngredient.ingredient.sauce.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrust();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
