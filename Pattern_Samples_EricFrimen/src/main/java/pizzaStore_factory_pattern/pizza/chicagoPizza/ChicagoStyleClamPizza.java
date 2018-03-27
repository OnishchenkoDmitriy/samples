package pizzaStore_factory_pattern.pizza.chicagoPizza;

import pizzaStore_factory_pattern.pizza.Pizza;

public class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        addToppings("Shredded", "Mozzarella", "Cheese");
    }
}
