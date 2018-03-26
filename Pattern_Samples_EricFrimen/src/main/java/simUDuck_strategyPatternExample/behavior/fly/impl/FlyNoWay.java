package simUDuck_strategyPatternExample.behavior.fly.impl;

import simUDuck_strategyPatternExample.behavior.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can not fly!!");
    }
}
