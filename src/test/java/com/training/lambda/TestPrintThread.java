package com.training.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.training.lamda.PrintNumbersUsingThread;

public class TestPrintThread {
	PrintNumbersUsingThread thread = new PrintNumbersUsingThread();

	@Test
	public void testPrintNumbersFromList() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		PrintNumbersUsingThread.consumer.accept(list);
	}

}
