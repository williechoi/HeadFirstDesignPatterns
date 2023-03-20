package FactoryPattern;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Parmesan Cheese");
        toppings.add("Spinach");
        toppings.add("Eggplant");
        toppings.add("Black Olives");
    }
}
