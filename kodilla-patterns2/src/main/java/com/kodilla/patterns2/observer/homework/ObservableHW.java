package com.kodilla.patterns2.observer.homework;

public interface ObservableHW {

    void registerObserver(ObserverHW observer);
    void notifyObservers();
    void removeObserver(ObserverHW observer);
}
