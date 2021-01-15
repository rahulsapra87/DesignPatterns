package com.designpatterns.sample.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Subject{

    private List<Observer> observers;
    private String message;

    public EmailTopic(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if(observer == null) throw new NullPointerException("Invalid/null observer");
        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update();
        }
    }

    public void postMessage(String msg){
        if(msg == null) throw new NullPointerException("null posted as message");

        System.out.println("message posted to my topic: "+msg);

        this.message = msg;
        notifyObservers();
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }
}
