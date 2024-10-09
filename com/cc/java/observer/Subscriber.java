package com.cc.java.observer;
import static com.cc.java.tools.Helper.out;

public class Subscriber extends Observer{

    private String name;
    private Subject subject;


    public Subscriber(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        subject.attach(this);
    }


    @Override
    public void update() {
        out(subject.getClass().getName() + " notified " + name);
    }


    @Override
    public void pushUpdate(String msg) {
        out(subject.getClass().getName() + " Message: " + msg + " für " + name);
    }
    
}
