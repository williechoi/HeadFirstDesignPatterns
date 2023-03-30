package command;

public class GarageDoor {
    String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println("Garage Door is open");
    }
    public void down() {
        System.out.println("Garage Door is closed");
    }
    public void stop() {
        System.out.println("Garage Door stopped");
    }
    public void lightOn() {
        System.out.println("Garage Door light is on!");
    }
    public void lightOff() {
        System.out.println("Garage Door light is off!");
    }
}
