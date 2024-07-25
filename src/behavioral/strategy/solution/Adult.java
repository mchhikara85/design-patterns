package behavioral.strategy.solution;

public class Adult extends Human {

    public Adult() {
        super(new OutdoorPlayingStrategy());
    }

    public void play() {
        System.out.println("Playing outdoors...");
    }
}
