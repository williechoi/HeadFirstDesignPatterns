package CommandPattern;

public class RemoteLoader {
    public static void main(String[] args) {

        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        Light livingRoomLight = new Light(Places.LIVING_ROOM);
        Light kitchenLight = new Light(Places.KITCHEN);
        CeilingFan ceilingFan = new CeilingFan(Places.LIVING_ROOM);
        GarageDoor garageDoor = new GarageDoor(Places.GARAGE);
        Stereo stereo = new Stereo(Places.LIVING_ROOM);

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);

        remoteControlWithUndo.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControlWithUndo.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControlWithUndo.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControlWithUndo.setCommand(3, stereoOnWithCD, stereoOffWithCD);
        remoteControlWithUndo.setCommand(4, garageDoorOpen, garageDoorClose);

        System.out.println(remoteControlWithUndo);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.onButtonWasPushed(1);
        remoteControlWithUndo.offButtonWasPushed(1);
        remoteControlWithUndo.onButtonWasPushed(2);
        remoteControlWithUndo.offButtonWasPushed(2);
        remoteControlWithUndo.onButtonWasPushed(3);
        remoteControlWithUndo.offButtonWasPushed(3);
        remoteControlWithUndo.onButtonWasPushed(4);
        remoteControlWithUndo.offButtonWasPushed(4);
        remoteControlWithUndo.onButtonWasPushed(5);
        remoteControlWithUndo.offButtonWasPushed(5);
        remoteControlWithUndo.onButtonWasPushed(6);
        remoteControlWithUndo.offButtonWasPushed(6);
    }
}
