package com.designpatterns.sample

class FirstKotlinClass(){

    fun routine(number: Int, delay : Long){
        println("routine no $number starts")
        Thread.sleep(delay)
        println("routine no $number ends")
    }
}