package StatePattern;

import java.util.Random;

public class GumballMachine {
    GumballState soldOutState;
    GumballState noQuarterState;
    GumballState hasQuarterState;
    GumballState soldState;
    GumballState winnerState;


    GumballState state;
    int count = 0;
    Random rand;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        winnerState = new WinnerState(this);

        this.count = count;
        rand = new Random(System.currentTimeMillis());

        if (count > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void setState(GumballState gumballState) {
        this.state = gumballState;
    }

    public GumballState getSoldOutState() {
        return soldOutState;
    }

    public GumballState getNoQuarterState() {
        return noQuarterState;
    }
    public GumballState getHasQuarterState() {
        return hasQuarterState;
    }
    public GumballState getSoldState() {
        return soldState;
    }
    public GumballState getWinnerState() {
        return winnerState;
    }
    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    public void dispense() {
        state.dispense();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
        stringBuffer.append("Mighty Gumball, Inc\n");
        stringBuffer.append("Java-enabled Standing Gumball Model #2004\n");
        stringBuffer.append("Inventory: ").append(count).append(" gumballs\n");
        if (count > 0) {
            stringBuffer.append("Machine waiting for quarter\n");
        } else {
            stringBuffer.append("Machine is sold out\n");
        }
        stringBuffer.append("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
        return stringBuffer.toString();
    }

    public void refill(int gumballs) {
        System.out.println("Adding " + gumballs + " gumballs to the gumball machine...");
        count += gumballs;
        if (this.state == soldOutState && count > 0) {
            state = noQuarterState;
        }
        System.out.println("Now the gumball machine has " + count + " gumballs");
    }

    public GumballState getState() {
        return state;
    }

    public int getCount() {
        return count;
    }
}
