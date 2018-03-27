package starbuzz_decorator_pattern.beverage.decorator;

import starbuzz_decorator_pattern.beverage.Beverage;

public class Whip extends Beverage {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return 0.18 + beverage.cost();
    }
}
