package com.cc.java.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        //hide constructor
    }


    public static Singleton getInstance() {
        return instance == null ?  instance = new Singleton() : instance;
    }

    // public static Singleton getInstance() {
    //     //Testmethode: erzeugt jedes mahl eine neue Instanz
    //     return instance == null ?  new Singleton() : instance;
    // }

}
