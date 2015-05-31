package com.example.kata.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FizzBuzzResultTest {

	@Test
	public void should_be_empty_by_default () {

		assertThat(new FizzBuzzResult().isEmpty(), is(true));
	}

}
