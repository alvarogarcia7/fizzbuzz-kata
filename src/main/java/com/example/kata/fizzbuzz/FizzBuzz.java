package com.example.kata.fizzbuzz;

public class FizzBuzz {

    public static final String BUZZ = "Buzz";

    String getFizzBuzzFor(int n) {
        String result = null;
        if (isDivisibleBy3(n) && n >= 6) {
            result = "Fizz";
        }
        if (isDivisibleBy5(n)) {
            result = BUZZ;
        }
        if (isDivisibleBy5(n) && isDivisibleBy3(n) && n >= 30) {
            result = "Fizz"+ BUZZ;
        }
        if (result == null) {
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
