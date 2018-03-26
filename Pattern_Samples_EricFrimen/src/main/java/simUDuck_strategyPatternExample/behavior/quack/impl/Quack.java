package simUDuck_strategyPatternExample.behavior.quack.impl;

import simUDuck_strategyPatternExample.behavior.quack.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
