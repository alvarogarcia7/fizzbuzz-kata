package com.example.kata.fizzbuzz;

public class FizzBuzz {

    private final FizzBuzzStrategy[] strategies;

    public FizzBuzz(FizzBuzzStrategy... strategies){
        this.strategies = strategies;
    }

    private static final String DEFAULT_RESULT = "";

    String getFor(int n) {
        String result = DEFAULT_RESULT;
        for(FizzBuzzStrategy current : strategies) {
            result = current.apply(n, result);
        }

        if (result == DEFAULT_RESULT) {
            result = String.valueOf(n);
        }
        return result;
    }
}
