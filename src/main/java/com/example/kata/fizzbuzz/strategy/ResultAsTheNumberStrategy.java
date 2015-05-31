package com.example.kata.fizzbuzz.strategy;

import com.example.kata.fizzbuzz.FizzBuzzResult;

public class ResultAsTheNumberStrategy implements  FizzBuzzStrategy {
	private final FizzBuzzResult fizzBuzzResult;

	public ResultAsTheNumberStrategy (final FizzBuzzResult fizzBuzzResult) {
		this.fizzBuzzResult = fizzBuzzResult;
	}

	@Override
	public void apply (final int n) {
		if(fizzBuzzResult.isEmpty()){
			fizzBuzzResult.append(String.valueOf(n));
		}
	}
}
