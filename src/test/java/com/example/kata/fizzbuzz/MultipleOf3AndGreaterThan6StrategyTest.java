package com.example.kata.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MultipleOf3AndGreaterThan6StrategyTest {

    @Test
    public void should_ask_the_multiplication_collaborator(){
        final MultipleOf multipleCollaborator = mock(MultipleOf.class);
        MultipleOf3AndGreaterThan6Strategy sut = new MultipleOf3AndGreaterThan6Strategy(multipleCollaborator);

        sut.apply(1,"");

        verify(multipleCollaborator).isMultipleOf(1);
    }

}