package com.training.lambda;

import com.training.lamda.MyOrders;

public class TestOrders{
	
	@Test
	public void testOrderPriceIsAcceptedOrCompleted() {
		
		TestOrders order = (a) -> if(a>10000) return "ACCEPTED";
	}

}
