package pizzaStore_factory_pattern.pizza.chicagoPizza;

import pizzaStore_factory_pattern.pizza.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        addToppings("Shredded", "Mozzarella", "Cheese");
    }
}
