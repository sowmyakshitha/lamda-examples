package com.training.lamda;

import java.util.List;
import java.util.function.Consumer;

public class PrintNumbersUsingThread {
	
	public static Consumer<List<Integer>> consumer = (list) -> {
		Runnable r = () -> {
			
			for(Integer integer : list)
				System.out.println(integer);
		};
		
		r.run();
	};


}
