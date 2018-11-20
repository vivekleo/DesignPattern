package com.thirdDesignPattern.Decorator.Condiments;

import com.thirdDesignPattern.Decorator.beverage.Beverage;

public class Mocha extends CondimentDecorator {

    private final Beverage beverage; //instance variable to hold the beverage we are wrapping.

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
        // beverage name with Mocha
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
        //Cost of beverage with mocha
    }
}
