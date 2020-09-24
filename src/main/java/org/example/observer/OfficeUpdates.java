package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class OfficeUpdates implements Observable {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        if (observer != null) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifySubscribers(String message) {
        for (Observer observer : this.observers) {
            observer.update(message);
        }
    }
}
