package simUDuck_strategy_pattern.behavior.fly.impl;

import simUDuck_strategy_pattern.behavior.fly.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I am flying with a rocket!!");
    }
}
