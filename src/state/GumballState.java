package state;

public interface GumballState {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
