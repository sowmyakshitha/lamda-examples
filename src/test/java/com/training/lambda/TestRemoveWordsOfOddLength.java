package com.training.lambda;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestRemoveWordsOfOddLength {
	
	@Test
	public void testWordsHavingOddLengthAreRemoved() {
		List<String> words = new ArrayList<String>();
		words.add("arjun");
		words.add("manu");
		words.add("srihitha");
		words.add("sowmya");
		words.add("anu");
		
		words.removeIf(str -> str.length() % 2 != 0);
		assertEquals(3,words.size() );
		
	}

}
