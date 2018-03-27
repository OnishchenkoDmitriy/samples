package pizzaStore_factory_pattern.store;

import pizzaStore_factory_pattern.pizza.Pizza;
import pizzaStore_factory_pattern.pizza.chicagoPizza.ChicagoStyleCheesePizza;
import pizzaStore_factory_pattern.pizza.chicagoPizza.ChicagoStyleClamPizza;
import pizzaStore_factory_pattern.pizza.chicagoPizza.ChicagoStylePepperoniPizza;
import pizzaStore_factory_pattern.pizza.chicagoPizza.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new ChicagoStyleCheesePizza();
                break;
            case "pepperoni":
                pizza = new ChicagoStylePepperoniPizza();
                break;
            case "clam":
                pizza = new ChicagoStyleClamPizza();
                break;
            case "veggie":
                pizza = new ChicagoStyleVeggiePizza();
                break;
        }
        return pizza;
    }
}
