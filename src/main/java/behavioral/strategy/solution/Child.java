package main.java.behavioral.strategy.solution;

public class Child extends Human {

    public Child() {
        super(new IndoorPlayingStrategy());
    }
}