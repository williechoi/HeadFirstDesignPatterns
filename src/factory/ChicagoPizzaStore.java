package factory;

public class ChicagoPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        Pizza pizza = null;
        if (item.equalsIgnoreCase("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (item.equalsIgnoreCase("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (item.equalsIgnoreCase("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        } else if (item.equalsIgnoreCase("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        }
        return pizza;
    }
}
