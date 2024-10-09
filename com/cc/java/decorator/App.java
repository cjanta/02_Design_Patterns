package com.cc.java.decorator;
import static com.cc.java.tools.Helper.out;

public class App {
    
    public static void main(String[] parameter){
        Beverage espresso = new Espresso();
        out(espresso.getDescription() + " $" + espresso.cost());

        Beverage mochaEspresso = new Mocha(espresso);
        out(mochaEspresso.getDescription() + " $" + mochaEspresso.cost());

        Beverage soyMochaEspresso = new Soy(mochaEspresso);
        out(soyMochaEspresso.getDescription() + " $" + soyMochaEspresso.cost());
    }
}
