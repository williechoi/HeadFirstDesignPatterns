package proxy;


public class WinnerState implements GumballState {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you two gumballs");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't give you four gumballs!");
    }

    @Override
    public void dispense() {
        System.out.println("Congratulations, you are the **WINNER**!");
        gumballMachine.count = gumballMachine.getCount() - 2;
        System.out.println("There are " + gumballMachine.count + " gumballs remaining.");
        if (gumballMachine.getCount() == 0) {
            System.out.println("Oops! out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
    }

    @Override
    public String toString() {
        return "You are WINNER!";
    }
}
