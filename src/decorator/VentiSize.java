package decorator;

public class VentiSize extends SizeDecorator {
    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Venti size";
    }
}
