package com.firstDesignPattern.stratergy.improved;

import com.firstDesignPattern.stratergy.improved.fly.FlyNoWay;
import com.firstDesignPattern.stratergy.improved.quack.MuteDuck;

public class RubberDuck extends Duck {
    //Client makes use of family of algorithms for both flying and quacking.
    public RubberDuck() {
        super(new FlyNoWay(), new MuteDuck());
    }
}
