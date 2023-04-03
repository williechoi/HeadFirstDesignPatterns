package compound;

public class GooseAdapter implements Quackable {
    Honkable goose;

    public GooseAdapter(Honkable goose) {
        this.goose = goose;
    }

    public void quack() {
        goose.honk();
    }
}
