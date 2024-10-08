package com.cc.java.singleton;

<<<<<<< HEAD

public class Singleton {

private int myNum;

public Singleton(int myNum) {
    this.myNum = myNum;
}

public int getMyNum() {
    return myNum;
}

public void setMyNum(int myNum) {
    this.myNum = myNum;
}









=======
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
>>>>>>> f76644cb2a32a4bf80eb88ec5b4d377fd917901c


}
