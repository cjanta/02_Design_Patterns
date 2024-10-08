package com.cc.java.singleton;
import static com.cc.java.singleton.Helper.out;

public class App {
    
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        out(obj1);
        obj1.actOnEvent();
        obj1.actOnEvent();
        // Events werden kumuliert ... 0 + 2
        Helper.out(obj1.getCounter());
        Helper.out("---------------------");
        
        Singleton obj2 = Singleton.getInstance();
        out(obj2);
        obj2.actOnEvent();
        obj2.actOnEvent();
        obj2.actOnEvent();
        // Events werden kumuliert ... 2 + 3
        Helper.out(obj2.getCounter());
        Helper.out("---------------------");


        Singleton obj3 = Singleton.getInstance();
        out(obj3);
        obj3.actOnEvent();
        obj3.actOnEvent();
        obj3.actOnEvent();
        obj3.actOnEvent();
        obj3.actOnEvent();
		
        // Events werden kumuliert ... 5 + 5
        out(obj3.getCounter());
   

    }


}

