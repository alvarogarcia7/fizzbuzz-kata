package com.example.kata.fizzbuzz;

public class FizzBuzz {
    String getFizzBuzzFor(int n) {
        String result = null;
        if (isDivisibleBy(n, 3) && n >= 6) {
            result = "Fizz";
        }
        if (n % 5 == 0) {
            result = "Buzz";
        }
        if (n % 5 == 0 && isDivisibleBy(n, 3) && n >= 30) {
            result = "FizzBuzz";
        }
        if (result == null) {
            result = String.valueOf(n);
        }
        return result;
    }

    private boolean isDivisibleBy(int n, int divisor) {
        return n % divisor == 0;
    }
}
