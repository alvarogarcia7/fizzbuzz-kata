package com.example.kata.fizzbuzz;

public class FizzBuzz {
    String getFizzBuzzFor(int n) {
        String result = null;
        if (n % 3 == 0 && n >= 6) {
            result = "Fizz";
        }
        if (n % 5 == 0) {
            result = "Buzz";
        }
        if (n % 5 == 0 && n % 3 == 0 && n >= 30) {
            result = "FizzBuzz";
        }
        if (result == null) {
            result = String.valueOf(n);
        }
        return result;
    }
}
