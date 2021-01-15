package com.designpatterns.sample.decoratorpattern;

public class ChocolateIceCream extends IceCreamDecorator {

    private final static int CHOCOLATE_FLAVOR = 20;
    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
        System.out.println("\nCreating chocolate ice-cream");
    }

    @Override
    public int cost() {
        System.out.println("adding chocolate: "+CHOCOLATE_FLAVOR);
        return CHOCOLATE_FLAVOR + super.cost();
    }
}
