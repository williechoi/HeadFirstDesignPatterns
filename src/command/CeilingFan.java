package command;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String name;
    int speed;

    public CeilingFan(String name) {
        this.name = name;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        // code to set fan to high
        System.out.println(this.getName() + " ceiling Fan running at HIGH speed!");
    }

    public void low() {
        speed = LOW;
        System.out.println(this.getName() + " ceiling Fan running at LOW speed!");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(this.getName() + " ceiling Fan running at MEDIUM speed!");
    }

    public void on() {
        System.out.println(this.getName() + " ceiling fan on!");
    }

    public void off() {
        speed = OFF;
        System.out.println(this.getName() + " ceiling fan off!");
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}
