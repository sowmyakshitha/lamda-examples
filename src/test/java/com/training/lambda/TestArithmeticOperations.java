package com.training.lambda;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.lamda.ArithmeticOperations;

public class TestArithmeticOperations {
	@Test
	public void testBasicArithmeticOperations() {
		ArithmeticOperations add = (a,b) -> (a+b);
		assertEquals(10, add.calculation(5, 5));
		
		ArithmeticOperations sub = (a,b) -> (a-b);
		assertEquals(0, sub.calculation(5, 5));
		
		ArithmeticOperations mul = (a,b) -> (a*b);
		assertEquals(25, mul.calculation(5, 5));
		
		ArithmeticOperations div = (a,b) -> (a/b);
		assertEquals(1, div.calculation(5, 5));
		
	}

}
