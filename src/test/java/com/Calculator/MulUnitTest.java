package com.Calculator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class MulUnitTest {

	Double numberA, numberB, result;

	@Test
	public void mulTwoPositive() {
		numberA = 9.75;
		numberB = 3.0;
		result = Calculator.mul(numberA, numberB);
		assertEquals(result, 29.25);
	}

	@Test
	public void mulTwoNegative() {
		numberA = -9.75;
		numberB = -3.0;
		result = Calculator.mul(numberA, numberB);
		assertEquals(result, 29.25);
	}

	@Test
	public void mulOnePositiveOneNegative() {
		numberA = -9.75;
		numberB = 3.0;
		result = Calculator.mul(numberA, numberB);
		assertEquals(result, -29.25);
	}
}
