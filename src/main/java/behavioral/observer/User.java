package main.java.behavioral.observer;

public class User implements IObserver {

    private IObservable observable;

    public User(IObservable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println(observable.getProductQuantity());
    }
}
