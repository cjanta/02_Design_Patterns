package com.cc.java.observer;
import static com.cc.java.tools.Helper.out;

public class App {

    public static void main(String[] args) {
        out("Teste Observer Design Pattern....");
        Subject notifier = new Subject();

        Observer_1 obsi_1 = new Observer_1("Observer vom Typ 1", notifier);
        Observer_2 obsi_2 = new Observer_2("Observer vom Typ 2", notifier);

        notifier.setState("Freigabe");





    }


}
