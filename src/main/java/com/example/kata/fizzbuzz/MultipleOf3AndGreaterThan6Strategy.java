package com.example.kata.fizzbuzz;

public class MultipleOf3AndGreaterThan6Strategy implements FizzBuzzStrategy {

    public static final String FIZZ = "Fizz";
    private final MultipleOf multipleCollaborator;

    public MultipleOf3AndGreaterThan6Strategy(MultipleOf multipleCollaborator) {

        this.multipleCollaborator = multipleCollaborator;
    }

    public MultipleOf3AndGreaterThan6Strategy(){
        this.multipleCollaborator = new MultipleOf();
    }

    @Override
    public String apply(int n, String existingResult) {
        String result = existingResult;
        if (multipleCollaborator.isMultipleOf(n) && n >= 6) {
            result += FIZZ;
        }
        return result;
    }


    private boolean isDivisibleBy3(int n) {
        return isDivisibleBy(n, 3);
    }

    private boolean isDivisibleBy(int n, int divisor) {
        return n % divisor == 0;
    }
}
