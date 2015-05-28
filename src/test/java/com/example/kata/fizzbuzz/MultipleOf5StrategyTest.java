package com.example.kata.fizzbuzz;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MultipleOf5StrategyTest {

    @Test
    public void should_ask_the_multiplication_collaborator(){
        final MultipleOf multipleCollaborator = mock(MultipleOf.class);
        FizzBuzzStrategy sut = new MultipleOf5Strategy(multipleCollaborator);

        sut.apply(1,"");

        verify(multipleCollaborator).isMultipleOf(1);
    }

}