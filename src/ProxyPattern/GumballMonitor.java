package ProxyPattern;

public class GumballMonitor {
    GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    public void report() {
        System.out.println("Gumball Machine: " + machine.getLocation());
        System.out.println("current inventory: " + machine.getCount() + " gumballs");
        System.out.println("current state: " + machine.getState());
    }
}
