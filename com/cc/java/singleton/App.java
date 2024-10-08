package com.cc.java.singleton;

public class App {
    
    public static void main(String[] args) {

        Singleton singleton1 = new Singleton(2);
        output("obj1: " + singleton1);
        output("myNum: " +  singleton1.getMyNum());

        Singleton singleton2 = new Singleton(3);
        output("obj1: " + singleton2);
        output("myNum: " +  singleton2.getMyNum());

   
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

