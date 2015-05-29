package com.example.kata.fizzbuzz;

public class FizzBuzz {

    private final FizzBuzzStrategy[] strategies;

    public FizzBuzz (FizzBuzzStrategy... strategies){
        this.strategies = strategies;
    }

    void getFor (int n) {
        for(FizzBuzzStrategy current : strategies) {
            current.apply(n);
        }
    }
}
