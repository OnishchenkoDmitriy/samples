package pizzaStore_factory_pattern.pizza.nyPizza;

import pizzaStore_factory_pattern.pizza.Pizza;

public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        addToppings("Grated", "Reggiano", "Cheese");
    }
}
