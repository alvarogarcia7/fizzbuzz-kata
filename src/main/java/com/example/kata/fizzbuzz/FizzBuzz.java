package com.example.kata.fizzbuzz;

public class FizzBuzz {

    private final FizzBuzzStrategy[] strategies;

    public FizzBuzz(FizzBuzzStrategy... strategies){
        this.strategies = strategies;
    }

    public static final String BUZZ = "Buzz";
    private static final String DEFAULT_RESULT = "";

    String getFor(int n) {
        String result = DEFAULT_RESULT;
        result = strategies[0].apply(n, result);
        result = strategies[1].apply(n, result);

        if (result == DEFAULT_RESULT) {
            result = String.valueOf(n);
        }
        return result;
    }
}
