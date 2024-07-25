package behavioral.strategy.solution;

public class Teenager extends Human {

    public Teenager() {
        super(new OutdoorPlayingStrategy());
    }

    public void play() {
        System.out.println("Playing outdoors...");
    }
}
