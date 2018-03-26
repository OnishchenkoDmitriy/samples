package simUDuck_strategy_pattern.duck;

import simUDuck_strategy_pattern.behavior.fly.impl.FlyNoWay;
import simUDuck_strategy_pattern.behavior.quack.impl.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I am a model Duck!!");
    }
}
