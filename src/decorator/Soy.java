package decorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        if (size == Size.TALL) {
            return 0.10 + beverage.cost();
        } else if (size == Size.GRANDE) {
            return 0.15 + beverage.cost();
        } else {
            return 0.20 + beverage.cost();
        }
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy milk";
    }
}
