package com.cc.java.singleton;

public class Helper {

    public static void out(String outputData) {
        System.out.println(outputData);  
    }

    // Überladene Methode
    public static void out(int outputData){
        System.out.println(outputData);
    }

    // Überladene Methode
    public static void out(boolean outputData){
        System.out.println(outputData);
    }
    
    // Überladene Methode
    public static void out(Object outputData){
        System.out.println(outputData);
    }

}
