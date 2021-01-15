package com.designpatterns.sample.observerpattern;

public class EmailTopicSubscriber implements Observer {

    private String name;
    private Subject subject;

    public EmailTopicSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) subject.getUpdate(this);
        if(msg == null)
            System.out.println(name + " has no new message: ");
        else
        System.out.println(name +" has received message: " + msg);
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
