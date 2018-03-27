package starbuzz_decorator_pattern.beverage.decorator;

import starbuzz_decorator_pattern.beverage.Beverage;

public class Soy extends Beverage {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return 0.29 + beverage.cost();
    }

}
