package com.kodilla.patterns2.observer.homework;


import java.util.ArrayList;
import java.util.List;

public class HomeworkQueue implements ObservableHW {

    private List<Assignment> assignments;
    private List<ObserverHW> observers;
    private String name;

    public HomeworkQueue(String name) {
        this.name = name;
        assignments = new ArrayList<>();
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(ObserverHW observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (ObserverHW observerHW: observers){
            observerHW.update(this);
        }
    }

    @Override
    public void removeObserver(ObserverHW observer) {
    observers.remove(observer);
    }

    public void sendHomework (Assignment assignment){
        assignments.add(assignment);
        notifyObservers();
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public List<ObserverHW> getObservers() {
        return observers;
    }

    public String getName() {
        return name;
    }
}
