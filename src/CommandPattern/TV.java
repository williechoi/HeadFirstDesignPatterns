package CommandPattern;

public class TV {
    String name;

    public TV(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.getName() + " TV is on");
    }

    public void off() {
        System.out.println(this.getName() + " TV is off");
    }

    public String getName() {
        return name;
    }
}
