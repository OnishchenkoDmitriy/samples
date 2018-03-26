package simUDuck_strategyPatternExample.duck;

import simUDuck_strategyPatternExample.behavior.fly.impl.FlyNoWay;
import simUDuck_strategyPatternExample.behavior.quack.impl.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I am a model Duck!!");
    }
}
