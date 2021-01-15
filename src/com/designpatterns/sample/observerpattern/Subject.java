package com.designpatterns.sample.observerpattern;



public interface Subject {
    public void registerObserver(Observer observer);
    public void unregisterObserver(Observer observer);
    public void notifyObservers();
    public Object getUpdate(Observer observer);
}
