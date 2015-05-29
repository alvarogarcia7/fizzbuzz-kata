package com.example.kata.fizzbuzz;

public class Executor {
	public void execute (final int n, final Condition condition, final Action action) {
		condition.executeIfApplies(n, action);
	}
}
