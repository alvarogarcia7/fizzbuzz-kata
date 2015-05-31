package com.example.kata.fizzbuzz;

import com.example.kata.fizzbuzz.strategy.MultipleOf;

public interface ConditionalExecutor {
	public void applyIfMatches(MultipleOf multipleOf, Runnable runnable);
}
