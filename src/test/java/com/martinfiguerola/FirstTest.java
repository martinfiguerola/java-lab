package com.martinfiguerola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest {

    @Test
    void twoPlusTwoEqualsFour() {
        // arrange
        int a = 2;
        int b = 2;

        // act
        int result = a + b;

        // assert
        assertEquals(4, result);
    }

    @Test
    void tenMinusFiveEqualsFive() {
        // arrange
        int a = 10;
        int b = 5;

        // act
        int result = a - b;

        // assert
        assertEquals(5, result);
    }
}
