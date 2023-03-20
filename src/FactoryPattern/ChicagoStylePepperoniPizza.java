package FactoryPattern;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Parmesan Cheese");
        toppings.add("Spinach");
        toppings.add("Eggplant");
        toppings.add("Black Olives");
        toppings.add("Pepperoni");
    }
}
