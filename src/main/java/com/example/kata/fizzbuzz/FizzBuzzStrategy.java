package com.example.kata.fizzbuzz;

public interface FizzBuzzStrategy {
    public void apply (int n, String existingResult, final FizzBuzzResult fizzBuzzResult);
}
