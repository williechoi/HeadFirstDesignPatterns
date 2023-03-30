package factory;

public class NYPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        Pizza pizza = null;
        if (item.equalsIgnoreCase("Cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (item.equalsIgnoreCase("Clam")) {
            pizza = new NYStyleClamPizza();
        } else if (item.equalsIgnoreCase("Veggie")) {
            pizza = new NYStyleVeggiePizza();
        } else if (item.equalsIgnoreCase("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        }
        return pizza;
    }
}
