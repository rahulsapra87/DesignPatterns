package com.designpatterns.sample.observerpattern;

public interface Observer {
    public void update();
    public void setSubject(Subject subject);
}
