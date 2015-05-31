package com.example.kata.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FizzBuzzResultTest {

	@Test
	public void should_be_empty_by_default () {

		assertThat(new FizzBuzzResult().isEmpty(), is(true));
	}

	@Test
	public void should_not_be_empty_after_adding_a_suffix () {
		final FizzBuzzResult fizzBuzzResult = new FizzBuzzResult();
		fizzBuzzResult.append("any");
		assertThat(fizzBuzzResult.isEmpty(), is(false));
	}

}
