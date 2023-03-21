package CommandPattern;

public class RemoteControlTest {
    // RemoteControlTest is the client, and essentially so are YOU!
    public static void main(String[] args) {
        // Like a waitress serving between a customer and a short-order cook,
        // Invoker takes commands from the client, and toss it to the receiver
        SimpleRemoteControl remote = new SimpleRemoteControl();
        remote.buttonWasPressed();

        // Receiver is the one who handles the real job.
        // It is similar to a short-order cook in a restaurant.
        Light livingRoomLight = new Light("Living Room"); // Receiver #1: Light
        GarageDoor garageDoor = new GarageDoor("Garage"); // Receiver #2: GarageDoor

        // Command is like an order about how to do something, like an order slip to the short-order cook.
        // Just as an order slip is dependent on a cook, a command is dependent on the receiver it is sent to
        LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOff = new LightOffCommand(livingRoomLight);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        // Pass the command to the Invoker, as if a client passes an order slip to a waitress
        remote.setCommand(lightOn);
        remote.setCommand(lightOff);
        remote.setCommand(lightOn);
        remote.setCommand(garageOpen);

        // It is the invoker that let the work happen.
        remote.buttonWasPressed();

        remote.buttonWasPressed();
    }
}
