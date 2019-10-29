package com.loicgeo.katas.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    private void beforeEachTest() {
        calculator = new Calculator();
    }

    @ParameterizedTest(name = "Addition:   {0} + {1} = {2}")
    @CsvSource({
            "0,    1.3,   1.3",
            "1,    2,   3",
            "49,  -51, -2",
            "1,  100, 101"
    })
    void should_add_two_numbers(double first, double second, double expectedResult) {
        assertEquals(expectedResult, calculator.add(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

}