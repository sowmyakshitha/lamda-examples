package com.training.lamda;

import static org.junit.Assert.assertEquals;

import java.util.function.Supplier;

import org.junit.Test;

public class FunctionalInterfaces {
	@Test
	public void testSupplierInterface() {
	Supplier<Integer> add = () -> Math.addExact(5, 5);
	System.out.println(add.get());
	
	assertEquals(10, () -> Math.addExact(5, 5));

}}
