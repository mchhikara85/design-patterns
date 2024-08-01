package behavioral.strategy.solution;

public class Teenager extends Human {

    public Teenager() {
        super(new OutdoorPlayingStrategy());
    }
}
