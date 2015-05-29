package com.example.kata.fizzbuzz.util;

import org.mockito.Mockito;

public class TestDoubles {
    public static <T> T stub (final Class<T> classToMock) {
        return mock(classToMock);
    }

    public static <T> T mock (final Class<T> classToMock) {
        return Mockito.mock(classToMock);
    }
}
