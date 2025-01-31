package main.java.behavioral.observer;

public interface IObservable {
    void registerObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers();
    int getProductQuantity();
    void addProduct(int productQuantity);
}
