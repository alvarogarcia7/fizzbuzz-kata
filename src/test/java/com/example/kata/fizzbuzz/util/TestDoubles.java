package com.example.kata.fizzbuzz.util;

import static org.mockito.Mockito.mock;

public class TestDoubles {
    public static <T> T stub (final Class<T> classToMock) {
        return mock(classToMock);
    }
}
