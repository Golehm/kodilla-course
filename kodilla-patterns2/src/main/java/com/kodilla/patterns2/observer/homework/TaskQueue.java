package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class TaskQueue implements Observable{
    private final String name;
    private final String surname;
    private final ArrayDeque<String> tasks;
    private final ArrayList<Observer> observers;

    public TaskQueue(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.tasks =  new ArrayDeque<String>();
        this.observers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public ArrayDeque<String> getTasks() {
        return tasks;
    }

    public void addTask (String task) {
        tasks.offer(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }
}
