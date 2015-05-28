package com.example.kata.fizzbuzz;

public class FizzBuzz {
    String getFizzBuzzFor(int n) {
        String result = null;
        if (isDivisibleBy(n, 3) && n >= 6) {
            result = "Fizz";
        }
        if (isDivisibleBy5(n)) {
            result = "Buzz";
        }
        if (isDivisibleBy5(n) && isDivisibleBy(n, 3) && n >= 30) {
            result = "FizzBuzz";
        }
        if (result == null) {
            result = String.valueOf(n);
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
