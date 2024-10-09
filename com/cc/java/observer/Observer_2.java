package com.cc.java.observer;
import static com.cc.java.tools.Helper.out;

public class Observer_2 extends Observer {

    private String name;
    private Subject subject;

    public Observer_2(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        out(subject.getClass().getName() + " notified " + name);
    }
    
}
