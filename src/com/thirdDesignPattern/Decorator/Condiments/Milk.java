package com.thirdDesignPattern.Decorator.Condiments;

import com.thirdDesignPattern.Decorator.beverage.Beverage;

public class Milk extends CondimentDecorator {
    private final Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
