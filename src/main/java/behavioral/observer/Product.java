package main.java.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements IObservable {

    private int productQuantity;
    private List<IObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public int getProductQuantity() {
        return this.productQuantity;
    }

    @Override
    public void addProduct(int qty) {
        this.productQuantity+= qty;
        this.notifyObservers();
    }
}
