package DecoratorPattern;

public abstract class SizeDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
