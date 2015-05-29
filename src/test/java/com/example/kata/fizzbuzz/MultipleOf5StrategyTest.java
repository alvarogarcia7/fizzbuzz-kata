package com.example.kata.fizzbuzz;

import org.junit.Test;

import static com.example.kata.fizzbuzz.util.StubBuilder.stub;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MultipleOf5StrategyTest {

    private static final int ANY_VALUE = 0;
    private FizzBuzzStrategy sut;

    @Test
    public void should_ask_the_multiplication_collaborator(){
        final MultipleOf multipleCollaborator = mock(MultipleOf.class);
        sut = sutWith(multipleCollaborator);

        sut.apply(1, "");

        verify(multipleCollaborator).isMultipleOf(1);
    }

    @Test
    public void should_add_fizz_when_the_condition_holds () {
        final MultipleOf multipleCollaborator = getMultipleCollaboratorThatAlwaysMatchesTheCondition();
        sut = sutWith(multipleCollaborator);

        final String result = sut.apply(ANY_VALUE, "");

        assertThat(result, is("Buzz"));
    }

    private MultipleOf getMultipleCollaboratorThatAlwaysMatchesTheCondition () {
        final MultipleOf multipleCollaborator = stub(MultipleOf.class);
        doReturn(true).when(multipleCollaborator).isMultipleOf(anyInt());
        return multipleCollaborator;
    }

    private MultipleOf5Strategy sutWith (final MultipleOf multipleCollaborator) {
        return new MultipleOf5Strategy(multipleCollaborator);
    }

}
