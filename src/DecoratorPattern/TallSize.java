package DecoratorPattern;

public class TallSize extends SizeDecorator {
    @Override
    public double cost() {
        return beverage.cost() + 0.0;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Tall size";
    }
}
