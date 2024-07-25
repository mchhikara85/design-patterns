package behavioral.strategy.solution;

public class Child extends Human {

    public Child() {
        super(new IndoorPlayingStrategy());
    }

    public void play() {
        System.out.println("Playing indoors with toys...");
    }
}
