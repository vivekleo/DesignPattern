package com.fourthDesignPattern.AbstractFactory.pizza;

import com.fourthDesignPattern.AbstractFactory.PizzaIngredient.ingredient.dough.Dough;
import com.fourthDesignPattern.AbstractFactory.PizzaIngredient.ingredient.sauce.Sauce;

import java.util.ArrayList;
import java.util.List;

/**
 * Factories produce Products.
 * Our Product is Pizza.
 */
public abstract class Pizza {
    //Each pizza has a name, dough, sauce and List of toppings
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected List<String> toppings;

    public Pizza() {
        toppings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //preparation follows number of steps in particular sequence.
    public void prepare() {
        System.out.println("Preparing: " + name);
        System.out.println("Tossing dough: " + dough.getName());
        System.out.println("Adding sauce: " + sauce.getName());
        System.out.print("Adding Toppings: ");
        toppings.forEach(topping -> System.out.print(topping + " "));
        System.out.println();
    }

    //defaults for baking, cutting and boxing.
    public void bake() {
        System.out.println("Baking for 25 min at 350");
    }

    public void cut() {
        System.out.println("Cut the pizza into diagonals");
    }

    public void box() {
        System.out.println("Place pizza in official Box");
    }
}
