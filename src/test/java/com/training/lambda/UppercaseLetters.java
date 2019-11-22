package com.training.lambda;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;

import org.junit.Test;

public class UppercaseLetters {
	@Test
	public void testUpperCaseLetters() {

		List<String> str = new ArrayList<String>();
		str.add("one");
		str.add("two");

		UnaryOperator<String> u = s -> s.toUpperCase();
		str.replaceAll(u);
		Iterator<String> iterator = str.iterator();
		assertEquals("ONE", iterator.next());
		assertEquals("TWO", iterator.next());
	}

}
