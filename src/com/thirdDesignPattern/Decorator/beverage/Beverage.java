package com.thirdDesignPattern.Decorator.beverage;

public abstract class Beverage {
    String description = "Unkonwn Description";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
