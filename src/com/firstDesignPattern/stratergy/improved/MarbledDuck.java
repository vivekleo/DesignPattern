package com.firstDesignPattern.stratergy.improved;

import com.firstDesignPattern.stratergy.improved.fly.FlyWithWings;
import com.firstDesignPattern.stratergy.improved.quack.Squeek;

public class MarbledDuck extends Duck {
    //Client makes use of family of algorithms for both flying and quacking.
    public MarbledDuck() {
        super(new FlyWithWings(), new Squeek());
    }
}
