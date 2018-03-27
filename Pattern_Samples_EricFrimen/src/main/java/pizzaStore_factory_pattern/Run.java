package pizzaStore_factory_pattern;

import pizzaStore_factory_pattern.pizza.Pizza;
import pizzaStore_factory_pattern.store.ChicagoStylePizzaStore;
import pizzaStore_factory_pattern.store.NYStylePizzaStore;
import pizzaStore_factory_pattern.store.PizzaStore;

public class Run {
    public static void main(String[] args) {

        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();

        Pizza pizza1 = nyPizzaStore.orderPizza("cheese");
        System.out.println("Etan ordered a " + pizza1.getName());

        Pizza pizza2 = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza2.getName());

    }
}
