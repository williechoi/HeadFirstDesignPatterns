package DecoratorPattern;

public class StarBucksCoffee {
    public static void main(String[] args) {
        Beverage drink1 = new Espresso();
        drink1 = new Mocha(drink1);
        drink1 = new Mocha(drink1);
        drink1 = new Whip(drink1);

        System.out.println(drink1.getDescription() + " (Price: $" + drink1.cost() + ")");

        Beverage drink2 = new HouseBlend();
        System.out.println(drink2.getDescription() + " (Price: $" + drink2.cost() + ")");

        Beverage drink3 = new Espresso();
        drink3 = new Soy(drink3);
        drink3 = new Whip(drink3);
        System.out.println(drink3.getDescription() + " (Price: $" + drink3.cost() + ")");
    }
}
