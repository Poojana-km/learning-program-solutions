package com.junitdemo;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        // Setup: Create a fresh Calculator before each test
        calculator = new Calculator();
        System.out.println("Setup done!");
    }

    @After
    public void tearDown() {
        // Teardown: Called after each test (optional here)
        System.out.println("Test completed!");
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 5;
        int b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        // Arrange
        int a = 10;
        int b = 4;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(6, result);
    }
}
