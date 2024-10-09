package com.cc.java.singleton;
import static com.cc.java.singleton.Helper.out;

public class App {
    
    public static void main(String[] args) {
        testSingletonClass();
    }

    private static void testSingletonClass(){
        out("testing classname: " + Singleton.class.getName());
        int sumRefs = 5;
        String refToCheck = "";
        for (int i = 0; i < sumRefs; i++) {
            Singleton obj = Singleton.getInstance();
            out("# objectRef: " + obj);
            if (i==0){
                refToCheck = obj.toString();
            } 
            checkReferences(refToCheck,obj);
        }
    }

    private static void checkReferences(String refToCheck, Singleton obj){
        if (!obj.toString().equals(refToCheck) ){
            throw new UnsupportedOperationException(Singleton.class.getName() + " >> Singleton Fehler: \"Mehrere Instanzen festgestellt!\"");
        }
    }

}

