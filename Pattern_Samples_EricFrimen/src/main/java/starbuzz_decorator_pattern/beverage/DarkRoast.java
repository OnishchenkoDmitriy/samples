package starbuzz_decorator_pattern.beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    public double cost() {
        return 2.43;
    }
}
