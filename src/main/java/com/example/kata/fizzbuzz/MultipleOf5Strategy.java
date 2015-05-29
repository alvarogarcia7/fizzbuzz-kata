package com.example.kata.fizzbuzz;

public class MultipleOf5Strategy implements FizzBuzzStrategy {

    public static final String BUZZ = "Buzz";
    private final MultipleOf multipleCollaborator;
    private final FizzBuzzResult fizzBuzzResult;

    public MultipleOf5Strategy(MultipleOf multipleCollaborator, FizzBuzzResult fizzBuzzResult) {

        this.multipleCollaborator = multipleCollaborator;
        this.fizzBuzzResult = fizzBuzzResult;
    }

    @Override
    public void apply (int n, String existingResult, final FizzBuzzResult fizzBuzzResult) {
        if (multipleCollaborator.isMultipleOf(n)) {
            this.fizzBuzzResult.append(BUZZ);
        }
    }
}
