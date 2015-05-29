package com.example.kata.fizzbuzz;


public class MultipleOf3AndGreaterThan6Strategy implements FizzBuzzStrategy {

    private static final String FIZZ = "Fizz";
    private final MultipleOf multipleCollaborator;
    private final FizzBuzzResult fizzBuzzResult;

    public MultipleOf3AndGreaterThan6Strategy (MultipleOf multipleCollaborator, final FizzBuzzResult fizzBuzzResult) {

        this.multipleCollaborator = multipleCollaborator;
        this.fizzBuzzResult = fizzBuzzResult;
    }


    @Override
    public void apply (int n, String existingResult, final FizzBuzzResult fizzBuzzResult) {
        if (multipleCollaborator.isMultipleOf(n) && n >= 6) {
            fizzBuzzResult.append(FIZZ);
        }
    }

}
