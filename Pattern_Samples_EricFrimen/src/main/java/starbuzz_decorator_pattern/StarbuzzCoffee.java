package starbuzz_decorator_pattern;

import starbuzz_decorator_pattern.beverage.Beverage;
import starbuzz_decorator_pattern.beverage.DarkRoast;
import starbuzz_decorator_pattern.beverage.Espresso;
import starbuzz_decorator_pattern.beverage.HouseBlend;
import starbuzz_decorator_pattern.beverage.decorator.Mocha;
import starbuzz_decorator_pattern.beverage.decorator.Soy;
import starbuzz_decorator_pattern.beverage.decorator.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage2.getDescription() + " $" + beverage3.cost());

    }

}
