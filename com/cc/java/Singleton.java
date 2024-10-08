package com.cc.java;

public class Singleton {

    // Objektbildung in der Klasse
    private static Singleton instance;

    // Feld, auf das NACH der Objektbildung zugegriffen wird
    private int counter;

    private Singleton() {

    }

    // ... in der Klasse
    public static Singleton getInstance() {
        
        if (instance == null) {
            return instance = new Singleton();
        }
        return instance;   
        
        // return instance == null ? instance = new Singleton() : instance;

    }

    // Funktionalität im Objekt

    // Getter für counter
    public int getCounter() {
        return counter;
    }

    // Event? --> counter  = counter + 1
    public void actOnEvent() {
        counter ++;
    }


}
