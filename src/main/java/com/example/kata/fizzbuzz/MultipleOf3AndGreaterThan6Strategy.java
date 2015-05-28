package com.example.kata.fizzbuzz;

public class MultipleOf3AndGreaterThan6Strategy implements FizzBuzzStrategy {

    public static final String FIZZ = "Fizz";

    public MultipleOf3AndGreaterThan6Strategy(MultipleOf multipleCollaborator) {

    }

    public MultipleOf3AndGreaterThan6Strategy(){

    }

    @Override
    public String apply(int n, String existingResult) {
        String result = existingResult;
        if (isDivisibleBy3(n) && n >= 6) {
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
