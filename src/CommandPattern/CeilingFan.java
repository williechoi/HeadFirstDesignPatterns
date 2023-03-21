package CommandPattern;

public class CeilingFan {
    String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.getName() + " ceiling fan on!");
    }

    public void off() {
        System.out.println(this.getName() + " ceiling fan off!");
    }

    public String getName() {
        return name;
    }
}
