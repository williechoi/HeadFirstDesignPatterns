package command;

public class Stereo {
    int volume = 0;
    String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.getName() + " stereo is on");
    }

    public void off() {
        System.out.println(this.getName() + " stereo is off");
    }

    public void setCD() {
        System.out.println(this.getName() + " stereo is set for CD input");
    }

    public void setVolume(int volume) {
        System.out.println(this.getName() + " stereo volume set to " + volume);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }
}
