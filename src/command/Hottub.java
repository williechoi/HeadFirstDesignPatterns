package command;

public class Hottub {
    String name;

    public Hottub(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.getName() + " Hottub heating to a steaming 104 degrees");
        System.out.println(this.getName() + " Hottub is bubbling!");
    }

    public void off() {
        System.out.println(this.getName() + " Hottub is cooling to 98 degrees");
    }

    public String getName() {
        return name;
    }
}
