package com.firstDesignPattern.stratergy.improved;

import com.firstDesignPattern.stratergy.improved.fly.FlyWithWings;
import com.firstDesignPattern.stratergy.improved.quack.Quack;

public class MallardDuck extends Duck {
    //Client makes use of family of algorithms for both flying and quacking.
    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }
}
