package CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        if (slot == null) {
            System.out.println("You must set the command first before execution.");
        } else {
            slot.execute();
        }
    }
}
