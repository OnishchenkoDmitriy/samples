package simUDuck_strategyPatternExample;

import simUDuck_strategyPatternExample.duck.Duck;
import simUDuck_strategyPatternExample.duck.MallardDuck;
import simUDuck_strategyPatternExample.duck.ModelDuck;
import simUDuck_strategyPatternExample.behavior.fly.impl.FlyRocketPowered;

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
