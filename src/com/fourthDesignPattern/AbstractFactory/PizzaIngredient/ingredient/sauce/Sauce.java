package com.fourthDesignPattern.AbstractFactory.PizzaIngredient.ingredient.sauce;

public abstract class Sauce {
    private String name;

    public Sauce(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
