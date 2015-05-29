package com.example.kata.fizzbuzz;

public class Action {

	public static final String FIZZ = "Fizz";

	FizzBuzzResult fizzBuzzResult;

	public Action(FizzBuzzResult fizzBuzzResult){
		this.fizzBuzzResult = fizzBuzzResult;
	}

	public void execute () {
		this.fizzBuzzResult.append(FIZZ);
	}
}
