package behavioral.strategy.solution;

public class IndoorPlayingStrategy implements IPlayingStrategy {

    @Override
    public void play() {
        System.out.println("Playing indoors with toys...");
    }
}
