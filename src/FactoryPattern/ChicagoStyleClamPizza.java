package FactoryPattern;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Frozen Clams");
        toppings.add("Parmesan Cheese");
        toppings.add("Frozen Clams");
    }
}
