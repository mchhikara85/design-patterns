package main.java.behavioral.strategy;

import main.java.behavioral.strategy.solution.Adult;
import main.java.behavioral.strategy.solution.Child;
import main.java.behavioral.strategy.solution.Human;
import main.java.behavioral.strategy.solution.Teenager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main1(String[] args) {
        /*List<HumanInitial> humans = new ArrayList<>();
        humans.add(new AdultInitial());
        humans.add(new ChildInitial());
        humans.add(new TeenagerInitial());*/

        List<Human> humans = new ArrayList<>();
        humans.add(new Adult());
        humans.add(new Child());
        humans.add(new Teenager());

        for (Human human : humans) {
            human.play();
        }
    }
}