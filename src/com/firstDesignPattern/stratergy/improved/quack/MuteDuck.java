package com.firstDesignPattern.stratergy.improved.quack;

public class MuteDuck implements QuackBehaviour {
    @Override
    public String quack() {
        return "Mute Duck";
    }
}
