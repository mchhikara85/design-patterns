package main.java.behavioral;

import main.java.behavioral.observer.IObservable;
import main.java.behavioral.observer.IObserver;
import main.java.behavioral.observer.Product;
import main.java.behavioral.observer.User;

public class Main {
    public static void main(String[] args) {
        /*List<HumanInitial> humans = new ArrayList<>();
        humans.add(new AdultInitial());
        humans.add(new ChildInitial());
        humans.add(new TeenagerInitial());*/

/*        List<Human> humans = new ArrayList<>();
        humans.add(new Adult());
        humans.add(new Child());
        humans.add(new Teenager());

        for (Human human : humans) {
            human.play();
        }*/

        IObservable product = new Product();
        IObserver user1  = new User(product);
        IObserver user2  = new User(product);

        product.registerObserver(user1);
        product.registerObserver(user2);

        product.addProduct(5);
    }
}