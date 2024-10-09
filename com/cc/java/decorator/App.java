package com.cc.java.decorator;

public class App {
    
    public static void main(String[] parameter){
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());
        
        Beverage mochaEspresso = new Mocha(espresso);
        System.out.println(mochaEspresso.getDescription() + " $" + mochaEspresso.cost());

        Beverage soyMochaEspresso = new Soy(mochaEspresso);
        System.out.println(soyMochaEspresso.getDescription() + " $" + soyMochaEspresso.cost());
    }
}
