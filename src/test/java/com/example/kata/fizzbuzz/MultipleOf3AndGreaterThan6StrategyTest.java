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
    private MultipleOf3AndGreaterThan6Strategy sut;

    @Test
    public void should_ask_the_multiplication_collaborator(){
        final MultipleOf multipleCollaborator = mock(MultipleOf.class);
        sut = sutWith(multipleCollaborator);

        sut.apply(ANY_VALUE,"");

        verify(multipleCollaborator).isMultipleOf(ANY_VALUE);
    }

    @Test
    public void should_add_fizz_when_the_condition_holds () {
        final MultipleOf multipleCollaborator = multipleThatAlwaysMatchesTheCondition();
        sut = sutWith(multipleCollaborator);

        final String result = sut.apply(6, "");

        MatcherAssert.assertThat(result, is("Fizz"));
    }

    private MultipleOf multipleThatAlwaysMatchesTheCondition () {
        final MultipleOf multipleCollaborator = stub(MultipleOf.class);
        doReturn(true).when(multipleCollaborator).isMultipleOf(anyInt());
        return multipleCollaborator;
    }

    private MultipleOf3AndGreaterThan6Strategy sutWith (final MultipleOf multipleCollaborator) {
        return new MultipleOf3AndGreaterThan6Strategy(multipleCollaborator);
    }

}
