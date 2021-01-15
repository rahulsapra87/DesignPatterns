package com.designpatterns.sample.decoratorpattern;

public class VanillaIceCream extends IceCreamDecorator {

    private final static int VANILLA_FLAVOR = 10;
    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
        System.out.println("\nCreating vanilla ice-cream");
    }

    public int cost(){
        System.out.println("adding vanilla :" +VANILLA_FLAVOR);
        return VANILLA_FLAVOR + super.cost();
    }
}
