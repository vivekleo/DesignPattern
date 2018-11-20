package com.thirdDesignPattern.Decorator.Condiments;

import com.thirdDesignPattern.Decorator.beverage.Beverage;

// Attaches additional responsibilities to an object dynamically.
// Decorators provide a flexible alternative to subclassing for extending functionality.
public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
