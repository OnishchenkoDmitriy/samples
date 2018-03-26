package simUDuck_strategy_pattern;

import simUDuck_strategy_pattern.duck.Duck;
import simUDuck_strategy_pattern.duck.MallardDuck;
import simUDuck_strategy_pattern.duck.ModelDuck;
import simUDuck_strategy_pattern.behavior.fly.impl.FlyRocketPowered;

public class MiniDuckSimulation {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
