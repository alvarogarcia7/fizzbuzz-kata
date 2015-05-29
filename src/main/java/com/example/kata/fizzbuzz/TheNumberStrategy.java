package com.example.kata.fizzbuzz;

public class TheNumberStrategy implements  FizzBuzzStrategy {
	private final FizzBuzzResult fizzBuzzResult;

	public TheNumberStrategy (final FizzBuzzResult fizzBuzzResult) {
		this.fizzBuzzResult = fizzBuzzResult;
	}

	@Override
	public void apply (final int n) {
		if(fizzBuzzResult.isEmpty()){
			fizzBuzzResult.append(String.valueOf(n));
		}
	}
}
