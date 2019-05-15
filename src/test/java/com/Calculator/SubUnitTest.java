package com.Calculator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SubUnitTest {

	Double numberA, numberB, result;

	@Test
	public void subTwoPositive() {
		numberA = 9.75;
		numberB = 3.0;
		result = Calculator.sub(numberA, numberB);
		assertEquals(result, 6.75);
	}

	@Test
	public void subTwoNegative() {
		numberA = -9.75;
		numberB = -3.0;
		result = Calculator.sub(numberA, numberB);
		assertEquals(result, -6.75);
	}

	@Test
	public void subOnePositiveOneNegative() {
		numberA = -9.75;
		numberB = 3.0;
		result = Calculator.sub(numberA, numberB);
		assertEquals(result, -12.75);
	}
}
