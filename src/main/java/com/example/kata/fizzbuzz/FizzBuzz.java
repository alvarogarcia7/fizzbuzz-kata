package com.example.kata.fizzbuzz;

public class FizzBuzz {

    public static final String BUZZ = "Buzz";
    public static final String FIZZ = "Fizz";
    private static final String DEFAULT_RESULT = null;

    String getFizzBuzzFor(int n) {
        String result = DEFAULT_RESULT;
        if (isDivisibleBy3(n) && n >= 6) {
            result = FIZZ;
        }
        if (isDivisibleBy5(n)) {
            result = BUZZ;
        }
        if (isDivisibleBy5(n) && isDivisibleBy3(n) && n >= 30) {
            result = FIZZ + BUZZ;
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
