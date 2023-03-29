package ProxyPattern;


public class HasQuarterState implements GumballState {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You already inserted a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        if (gumballMachine.getCount() >= 2 && gumballMachine.rand.nextInt(5) == 0) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
        gumballMachine.dispense();
    }

    @Override
    public void dispense() {
        System.out.println("You need to turn the crank");
    }

    @Override
    public String toString() {
        return "quarter is in!";
    }
}
