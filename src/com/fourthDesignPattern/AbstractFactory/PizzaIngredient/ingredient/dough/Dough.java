package com.fourthDesignPattern.AbstractFactory.PizzaIngredient.ingredient.dough;

public abstract class Dough {
    private String name;

    public Dough(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
