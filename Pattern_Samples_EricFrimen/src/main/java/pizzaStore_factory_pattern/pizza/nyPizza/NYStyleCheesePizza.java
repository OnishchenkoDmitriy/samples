package pizzaStore_factory_pattern.pizza.nyPizza;

import pizzaStore_factory_pattern.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        addToppings("Grated", "Reggiano", "Cheese");
    }

}
