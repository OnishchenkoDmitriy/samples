package simUDuck_strategyPatternExample.behavior.fly.impl;

import simUDuck_strategyPatternExample.behavior.fly.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I am flying with a rocket!!");
    }
}
