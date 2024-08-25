package com.revature;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import calculator.Calculator;

public class CalculatorTestWithData {

	@ParameterizedTest
    @CsvSource({
        "10, 20, 30",
        "0, 5, 5",
        "-10, 20, 10"
    })
    void testSumWithCsvSource(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        assertEquals(expected, calculator.sum(a, b));
    }
}
