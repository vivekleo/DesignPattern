package com.firstDesignPattern.stratergy.improved.fly;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public String fly() {
        return "Cannot fly";
    }
}
