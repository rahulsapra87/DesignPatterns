package com.designpatterns.sample.strategypattern;

public class BalloonAlgorithm extends ScoreAlgorithmBase{
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier ) -10;
    }
}
