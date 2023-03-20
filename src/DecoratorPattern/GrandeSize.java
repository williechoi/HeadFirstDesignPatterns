package DecoratorPattern;

public class GrandeSize extends SizeDecorator {
    @Override
    public double cost() {
        return beverage.cost() + 0.05;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Grande size";
    }
}
