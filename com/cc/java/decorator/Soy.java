package com.cc.java.decorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
    
}
