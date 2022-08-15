package com.springBoot.restServices.demo;

import java.util.HashSet;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {

		Set<String> testSet  = new HashSet<>();
		testSet.add("Value1");
		testSet.add("Value2");
		testSet.add("Value3");
		testSet.add("Value4");
		
		System.out.println("Values in set"+testSet);
	}

}
