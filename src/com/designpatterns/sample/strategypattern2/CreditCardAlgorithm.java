package com.designpatterns.sample.strategypattern2;

public class CreditCardAlgorithm implements  Payment{

    private String cardNo;
    private String name;

    public CreditCardAlgorithm(String cardNo, String name){
        this.cardNo = cardNo;
        this.name = name;
    }

    @Override
    public void pay(int amount) {
        System.out.println("amount "+ amount + " paid by credit card.");
    }
}
