package com.designpatterns.sample.decoratorpattern;

public class IceCreamDecorator implements IceCream {

    private IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int cost() {
        return this.iceCream.cost();
    }
}
