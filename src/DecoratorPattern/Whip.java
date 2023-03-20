package DecoratorPattern;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        if (size == Size.TALL) {
            return 0.50 + beverage.cost();
        } else if (size == Size.GRANDE) {
            return 0.55 + beverage.cost();
        } else {
            return 0.60 + beverage.cost();
        }
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip cream";
    }
}
