package com.designpatterns.sample.strategypattern;

public class ScoreBoard {

    public ScoreAlgorithmBase scoreAlgorithmBase;

    //region Description
    public void showScore(int taps, int multiplier){
        System.out.println(scoreAlgorithmBase.calculateScore(taps, multiplier));
    }
    //endregion
}
