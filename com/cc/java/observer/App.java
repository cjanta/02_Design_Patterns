package com.cc.java.observer;
import static com.cc.java.tools.Helper.out;

public class App {

    public static void main(String[] args) {
        out("Teste Observer Design Pattern....");
        Subject notifier = new Subject();

        Subscriber lisa = new Subscriber("Lisa", notifier);
        Subscriber hugo = new Subscriber("Hugo", notifier);
        

        notifier.setState("Freigabe");

    }


}
