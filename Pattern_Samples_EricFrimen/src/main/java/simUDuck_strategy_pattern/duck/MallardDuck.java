package simUDuck_strategy_pattern.duck;

import simUDuck_strategy_pattern.behavior.fly.impl.FlyWithWings;
import simUDuck_strategy_pattern.behavior.quack.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am a real Mallard Duck!");
    }
}
