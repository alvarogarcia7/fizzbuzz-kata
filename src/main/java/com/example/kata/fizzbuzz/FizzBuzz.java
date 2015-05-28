package com.example.kata.fizzbuzz;

public class FizzBuzz {

    private final FizzBuzzStrategy[] strategies;

    public FizzBuzz(FizzBuzzStrategy... strategies){
        this.strategies = strategies;
    }

    public static final String BUZZ = "Buzz";
    public static final String FIZZ = "Fizz";
    private static final String DEFAULT_RESULT = "";

    String getFor(int n) {
        String result = DEFAULT_RESULT;
        result = strategies[0].apply(n, result);

        if (isDivisibleBy5(n)) {
            result += BUZZ;
        }
        if (result == DEFAULT_RESULT) {
            result = String.valueOf(n);
        }
        return result;
    }

    private boolean isDivisibleBy3(int n) {
        return isDivisibleBy(n, 3);
    }

    private boolean isDivisibleBy5(int n) {
        return isDivisibleBy(n, 5);
    }

    private boolean isDivisibleBy(int n, int divisor) {
        return n % divisor == 0;
    }
}
