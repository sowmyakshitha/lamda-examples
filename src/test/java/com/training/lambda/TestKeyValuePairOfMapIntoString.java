package com.training.lambda;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class TestKeyValuePairOfMapIntoString {

	@Test
	public void testConvertsKeyValuePairOfmapIntoSingleString() {

		Map<String, String> map = new HashMap<String, String>();
		map.put("one", "two");
		map.put("Three", "Four");
		map.put("Five", "six");
		// System.out.println(map);
		String seperator = "=";

		StringBuffer buffer = new StringBuffer();
		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			System.out.println(iterator.next());
			System.out.println(iterator.next());

			buffer.append(entry.getKey());
			buffer.append(seperator);
			buffer.append(entry.getValue());

		}
		System.out.println(buffer);
		assertThat(buffer.toString(), is("one two Three Four Five six"));

	}
}
