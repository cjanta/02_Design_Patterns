package com.cc.java.observer;
import static com.cc.java.singleton.Helper.out;
import java.util.ArrayList;

public class Subject implements Observable {
    private ArrayList<Observer> observers = new ArrayList<>();
    private String state = "Initial";


    public String getState() {
        return state;
    }
    public void setState(String state) {
        if (!this.state.equals(state)){
            out(this.getClass().getName() + " State-Change from: " + this.state + " to: " + state);
            this.state = state;
            notifyObservers();
        }
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        out(this.getClass().getName() + " Update Observers...");
        observers.stream().forEach(o -> o.update());
    }


}
