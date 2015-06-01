package com.example.kata.fizzbuzz.strategy;

import com.example.kata.fizzbuzz.FizzBuzzResult;

public class MultipleOf5Strategy implements FizzBuzzStrategy {

    public static final String BUZZ = "Buzz";
    private final MultipleOf multipleCollaborator;
    private final FizzBuzzResult fizzBuzzResult;

    public MultipleOf5Strategy(MultipleOf multipleCollaborator, FizzBuzzResult fizzBuzzResult) {

        this.multipleCollaborator = multipleCollaborator;
        this.fizzBuzzResult = fizzBuzzResult;
    }

    @Override
    public void apply (int n) {
        if (multipleCollaborator.isMultipleOf(n)) {
            this.fizzBuzzResult.append(BUZZ);
        }
    }
}
