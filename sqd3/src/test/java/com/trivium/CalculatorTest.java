package com.trivium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
 * This is the unit test code for the calculator.
 */
 class CalculatorTest {

	

	@Test
	 void testSubtract() {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(5, 3);
		assertEquals(2, result);
	}
}
