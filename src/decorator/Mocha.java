package decorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        if (size == Size.TALL) {
            return 0.20 + beverage.cost();
        } else if (size == Size.GRANDE) {
            return 0.25 + beverage.cost();
        } else {
            return 0.30 + beverage.cost();
        }
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
