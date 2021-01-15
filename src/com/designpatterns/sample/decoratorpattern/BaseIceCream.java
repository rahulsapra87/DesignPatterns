package com.designpatterns.sample.decoratorpattern;

public class BaseIceCream implements IceCream {

    public BaseIceCream(){
        System.out.println("Creating base ice-cream");
    }

    @Override
    public int cost() {
        System.out.println("base cost: " + 100);
        return 100;
    }
}
