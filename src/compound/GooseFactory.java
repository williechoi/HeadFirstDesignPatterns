package compound;

public class GooseFactory extends AbstractGooseFactory {
    public Honkable createGoose() {
        return new Goose();
    }
}
