package main.java.behavioral;

import main.java.behavioral.iterator.Aggregator;
import main.java.behavioral.iterator.Book;
import main.java.behavioral.iterator.Iterator;
import main.java.behavioral.iterator.Library;

import java.util.ArrayList;
import java.util.List;

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

/*        IObservable product = new Product();
        IObserver user1  = new User(product);
        IObserver user2  = new User(product);

        product.registerObserver(user1);
        product.registerObserver(user2);

        product.addProduct(5);*/

        List<Book> books = new ArrayList<>();
        books.add(new Book("Live in Pisgan", "Writer 1"));
        books.add(new Book("Happy Bunny", "Writer 2"));
        Aggregator aggregator = new Library(books);
        Iterator<Book> iterator = aggregator.createIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}