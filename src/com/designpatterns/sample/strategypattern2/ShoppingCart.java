package com.designpatterns.sample.strategypattern2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        if(product == null) throw new NullPointerException("invalid/null product");
        if(!products.contains(product)) {
            products.add(product);
        }
    }

    public void removeProduct(Product p){
        if(products != null && p != null) {
            products.remove(p);
        }
    }

    private int calculateTotal(){
        int totalAmount = 0;
        for(Product p : products){
            totalAmount += p.getPrice();
        }
        return totalAmount;
    }

    public void pay(Payment paymentStrategy){
        paymentStrategy.pay(calculateTotal());
    }
}
