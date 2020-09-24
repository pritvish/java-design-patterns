package org.example.observer;

public class Employee implements Observer {

    @Override
    public void update(String message) {
        System.out.println("New update for employee is : "+message);
    }
}
