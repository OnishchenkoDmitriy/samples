package simUDuck_strategyPatternExample.duck;

import simUDuck_strategyPatternExample.behavior.fly.impl.FlyWithWings;
import simUDuck_strategyPatternExample.behavior.quack.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am a real Mallard Duck!");
    }
}
