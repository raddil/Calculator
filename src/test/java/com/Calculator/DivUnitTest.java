package com.Calculator;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class DivUnitTest {

	Double numberA, numberB, result;

	@Test
	public void divTwoPositive() {
		numberA = 9.75;
		numberB = 3.0;
		result = Calculator.div(numberA, numberB);
		assertEquals(result, 3.25);
	}

	@Test
	public void divTwoNegative() {
		numberA = -9.75;
		numberB = -3.0;
		result = Calculator.div(numberA, numberB);
		assertEquals(result, 3.25);
	}

	@Test
	public void divOnePositiveOneNegative() {
		numberA = -9.75;
		numberB = 3.0;
		result = Calculator.div(numberA, numberB);
		assertEquals(result, -3.25);
	}
}
