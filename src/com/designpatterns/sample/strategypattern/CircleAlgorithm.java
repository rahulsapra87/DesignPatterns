package com.designpatterns.sample.strategypattern;

public class CircleAlgorithm extends ScoreAlgorithmBase{
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier ) + 30;
    }
}
