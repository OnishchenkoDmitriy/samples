package pizzaStore_factory_pattern.pizza.nyPizza;

import pizzaStore_factory_pattern.pizza.Pizza;

public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        name = "NY Style Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        addToppings("Grated", "Reggiano", "Cheese");
    }
}
