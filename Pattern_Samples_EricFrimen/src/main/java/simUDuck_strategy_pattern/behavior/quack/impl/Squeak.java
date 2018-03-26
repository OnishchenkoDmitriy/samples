package simUDuck_strategy_pattern.behavior.quack.impl;

import simUDuck_strategy_pattern.behavior.quack.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
