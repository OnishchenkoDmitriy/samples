package simUDuck_strategy_pattern.behavior.quack.impl;

import simUDuck_strategy_pattern.behavior.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< SILENCE >>");
    }
}
