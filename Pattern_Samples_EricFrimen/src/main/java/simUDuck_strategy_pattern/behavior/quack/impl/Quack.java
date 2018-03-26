package simUDuck_strategy_pattern.behavior.quack.impl;

import simUDuck_strategy_pattern.behavior.quack.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
