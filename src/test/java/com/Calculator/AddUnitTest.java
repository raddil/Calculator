package com.Calculator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AddUnitTest {

	Double numberA, numberB, result;

	@Test
	public void addTwoPositive() {
		numberA = 10.1;
		numberB = 12.75;
		result = Calculator.add(numberA, numberB);
		assertEquals(result, 22.85);
	}
	
	 @Test
	  public void addTwoNegative() {
		  numberA = -10.1;
		  numberB = -12.75;
		  result = Calculator.add(numberA, numberB);
		  assertEquals(result, -22.85);
	  }
	 
	 @Test
	  public void addOnePositiveOneNegative() {
		  numberA = 10.1;
		  numberB = -12.75;
		  result = Calculator.add(numberA, numberB);
		  assertEquals(result, -2,65);
	  }
}
