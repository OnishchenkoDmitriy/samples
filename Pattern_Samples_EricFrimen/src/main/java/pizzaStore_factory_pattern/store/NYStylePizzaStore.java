package pizzaStore_factory_pattern.store;

import pizzaStore_factory_pattern.pizza.Pizza;
import pizzaStore_factory_pattern.pizza.nyPizza.NYStyleCheesePizza;
import pizzaStore_factory_pattern.pizza.nyPizza.NYStyleClamPizza;
import pizzaStore_factory_pattern.pizza.nyPizza.NYStylePepperoniPizza;
import pizzaStore_factory_pattern.pizza.nyPizza.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
            case "pepperoni":
                pizza = new NYStylePepperoniPizza();
                break;
            case "clam":
                pizza = new NYStyleClamPizza();
                break;
            case "veggie":
                pizza = new NYStyleVeggiePizza();
                break;
        }
        return pizza;
    }
}
