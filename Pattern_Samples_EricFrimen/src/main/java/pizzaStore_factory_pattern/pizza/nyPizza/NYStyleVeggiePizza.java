package pizzaStore_factory_pattern.pizza.nyPizza;

import pizzaStore_factory_pattern.pizza.Pizza;

public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        addToppings("Grated", "Reggiano", "Cheese");
    }
}
