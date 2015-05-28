package com.example.kata.fizzbuzz;

public class MultipleOf {
    private final int divisor;

    public MultipleOf(int divisor) {

        this.divisor = divisor;
    }

    public boolean isMultipleOf(int n) {
        return n % divisor == 0;
    }
}
