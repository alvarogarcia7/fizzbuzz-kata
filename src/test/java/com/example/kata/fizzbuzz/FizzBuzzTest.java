package com.example.kata.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_the_same_value_for_non_multiples_of_3_or_5() {
        assertThat(fizzbuzz(3), is("3"));
    }

    @Test
    public void should_return_fizz_for_multiples_of_3_greater_or_equal_than_6() {
        assertThat(fizzbuzz(6), is("Fizz"));
    }

    @Test
    public void should_return_buzz_for_multiples_of_5() {
        assertThat(fizzbuzz(5), is("Buzz"));
    }

    private String fizzbuzz(int n) {
        if(n%3 == 0 && n >= 6) {
            return "Fizz";
        }
        if(n%5 == 0) {
            return "Buzz";
        }
        return String.valueOf(n);
    }


}
