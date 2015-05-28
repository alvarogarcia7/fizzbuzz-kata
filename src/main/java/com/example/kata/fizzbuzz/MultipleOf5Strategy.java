package com.example.kata.fizzbuzz;

public class MultipleOf5Strategy implements FizzBuzzStrategy {

    public static final String BUZZ = "Buzz";

    @Override
    public String apply(int n, String existingResult) {
        String result = existingResult;
        if (isDivisibleBy5(n)) {
            result += BUZZ;
        }
        return result;
    }

    private boolean isDivisibleBy5(int n) {
        return isDivisibleBy(n, 5);
    }

    private boolean isDivisibleBy(int n, int divisor) {
        return n % divisor == 0;
    }
}
