package ProxyPattern;

import java.io.*;

public interface GumballState extends Serializable {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
