package com.example.kata.fizzbuzz;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static com.example.kata.fizzbuzz.util.StubBuilder.stub;
import static org.hamcrest.Matchers.is;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MultipleOf3AndGreaterThan6StrategyTest {

    private int ANY_VALUE = 1;

    @Test
    public void should_ask_the_multiplication_collaborator(){
        final MultipleOf multipleCollaborator = mock(MultipleOf.class);
        MultipleOf3AndGreaterThan6Strategy sut = new MultipleOf3AndGreaterThan6Strategy(multipleCollaborator);

        sut.apply(ANY_VALUE,"");

        verify(multipleCollaborator).isMultipleOf(ANY_VALUE);
    }

    @Test
    public void should_add_fizz_when_the_condition_holds () {
        final MultipleOf multipleCollaborator = stub(MultipleOf.class);
        doReturn(true).when(multipleCollaborator).isMultipleOf(anyInt());

        final MultipleOf3AndGreaterThan6Strategy sut = new MultipleOf3AndGreaterThan6Strategy(multipleCollaborator);

        MatcherAssert.assertThat(sut.apply(6,""), is("Fizz"));
    }

}
