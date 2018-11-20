package com.secondDesignPattern.Observer;

public interface Subject {

    //both these methods take Observer as argument; Observer to be registered or removed.
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    //this method is used to notify all the observers when subject changes its state.
    void notifyObservers();
}
