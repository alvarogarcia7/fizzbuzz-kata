package com.example.kata.fizzbuzz;

public class MultipleOf5Strategy implements FizzBuzzStrategy {

    public static final String BUZZ = "Buzz";
    private final MultipleOf multipleCollaborator;

    public MultipleOf5Strategy(MultipleOf multipleCollaborator) {

        this.multipleCollaborator = multipleCollaborator;
    }

    @Override
    public String apply(int n, String existingResult) {
        String result = existingResult;
        if (multipleCollaborator.isMultipleOf(n)) {
            result += BUZZ;
        }
        return result;
    }
}
