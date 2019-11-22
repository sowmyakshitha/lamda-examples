package com.training.lambda;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Test;

public class StringConsistsOfFirstLetterOfEachWord {

	@Test
	public void testCreateStringOfFirstLetterOfEachWord() {
		
		List<String> words = new ArrayList<String>();
		words.add("apple");
		words.add("bat");
		words.add("cat");
		words.add("dog");
		
		StringBuilder string = new StringBuilder();
		
		Consumer<List<String>> firstLetters = word -> words.forEach(c -> string.append(c.charAt(0)));
		firstLetters.accept(words);
		
		assertThat(string.toString(), is("abcd"));
		
	}
}
