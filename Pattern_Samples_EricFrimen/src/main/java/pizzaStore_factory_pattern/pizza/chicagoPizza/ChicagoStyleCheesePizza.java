package pizzaStore_factory_pattern.pizza.chicagoPizza;

import pizzaStore_factory_pattern.pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        addToppings("Shredded", "Mozzarella", "Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
