package main.java.behavioral.strategy.solution;

public class Human {

    private IPlayingStrategy playingStrategy;

    public Human(IPlayingStrategy playingStrategy) {
        this.playingStrategy = playingStrategy;
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void play() {
        playingStrategy.play();
    };
}
