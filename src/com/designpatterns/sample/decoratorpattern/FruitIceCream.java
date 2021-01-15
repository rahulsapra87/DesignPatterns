package com.designpatterns.sample.decoratorpattern;

public class FruitIceCream extends IceCreamDecorator {

    private final static int FRUIT_FLAVOR = 30;
    public FruitIceCream(IceCream iceCream){
        super(iceCream);
        System.out.println("\nCreating Fruit ice-cream");
    }

    @Override
    public int cost() {
        System.out.println("adding Fruit: " + FRUIT_FLAVOR);
        return FRUIT_FLAVOR + super.cost();
    }
}
