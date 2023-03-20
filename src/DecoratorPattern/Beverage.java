package DecoratorPattern;

public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI}

    String description = "Unknown Beverage";
    Size size = Size.TALL;

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();

}
