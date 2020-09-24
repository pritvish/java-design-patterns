package org.example.observer;

public class Manager implements Observer {

    @Override
    public void update(String message) {
        System.out.println("New update for Manager is : "+message);
    }
}
