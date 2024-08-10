package main.java.behavioral.strategy.solution;

public class OutdoorPlayingStrategy implements IPlayingStrategy {

    @Override
    public void play() {
        System.out.println("Plying outdoors...");
    }
}
