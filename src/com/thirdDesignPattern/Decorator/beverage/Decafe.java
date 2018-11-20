package com.thirdDesignPattern.Decorator.beverage;

public class Decafe extends Beverage {
    public Decafe() {
        description = "Decafe";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
