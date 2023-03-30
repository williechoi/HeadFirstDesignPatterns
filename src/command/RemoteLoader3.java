package command;

public class RemoteLoader3 {
    public static void main(String[] args) {
        RemoteControlWithUndo remote = new RemoteControlWithUndo();

        Light light = new Light(Places.LIVING_ROOM);
        TV tv = new TV(Places.LIVING_ROOM);
        Stereo stereo = new Stereo(Places.LIVING_ROOM);
        Hottub hottub = new Hottub(Places.BATHROOM);

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);
        HottubOffCommand hottubOffCommand = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOnCommand, stereoOnWithCDCommand, tvOnCommand, hottubOnCommand};
        Command[] partyOff = {lightOffCommand, stereoOffWithCDCommand, tvOffCommand, hottubOffCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remote.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remote);
        System.out.println("--- Pushing Macro On ---");
        remote.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off ---");
        remote.offButtonWasPushed(0);

    }
}
