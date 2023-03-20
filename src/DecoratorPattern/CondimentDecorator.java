package DecoratorPattern;

public abstract class CondimentDecorator extends Beverage {
    // By setting this method as abstract, it can force subclasses to implement this method.
    Beverage beverage;
    public abstract String getDescription();
}
