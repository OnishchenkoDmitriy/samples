package pizzaStore_factory_pattern.pizza.chicagoPizza;

import pizzaStore_factory_pattern.pizza.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        addToppings("Shredded", "Mozzarella", "Cheese");
    }
}
