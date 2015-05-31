package com.example.kata.fizzbuzz;

public class FizzBuzzResult {

	private final StringBuilder stringBuilder = new StringBuilder();

	public void append (final String suffix) {
		stringBuilder.append(suffix);
	}

	public String get () {
		return stringBuilder.toString();
	}

	public boolean isEmpty () {
		return stringBuilder.length() == 0;
	}
}
