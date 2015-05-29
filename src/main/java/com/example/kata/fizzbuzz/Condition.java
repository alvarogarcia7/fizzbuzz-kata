package com.example.kata.fizzbuzz;

public class Condition {
	public void executeIfApplies (final int n, final Action action) {
		if(appliesTo(n)) {
			action.execute();
		}
	}

	public boolean appliesTo (final int n) {
		return false;
	}
}
