package com.example.kata.fizzbuzz;

public class FizzBuzz {

    private final FizzBuzzStrategy[] strategies;
    private final FizzBuzzResult fizzBuzzResult;

    public FizzBuzz (final FizzBuzzResult fizzBuzzResult, FizzBuzzStrategy... strategies){
        this.strategies = strategies;
        this.fizzBuzzResult = fizzBuzzResult;
    }

    private static final String DEFAULT_RESULT = "";

    String getFor(int n) {
        String result = DEFAULT_RESULT;
        for(FizzBuzzStrategy current : strategies) {
            current.apply(n, fizzBuzzResult);
        }

        if (fizzBuzzResult.isEmpty()) {
            fizzBuzzResult.append(String.valueOf(n));
        }
        return fizzBuzzResult.get();
    }
}
