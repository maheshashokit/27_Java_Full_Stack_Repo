package com.ashokit.functionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionFunctionalInterfaceClient {

	public static void main(String[] args) {
		
		Function<String,Integer> noFunction = noAsString -> {
			return Integer.valueOf(noAsString);
		};		
		//calling the abstract method of Function FunctionalInterface
		System.out.println("NO::::::" + noFunction.apply("25668"));
		
		//Customer Function
		Customer cust1 = new Customer("AIT123","Mahesh","Hyderabad");
		Function<Customer,String> custFunction = cust -> {
			return cust.customerId;
		};
		//call the apply method
		System.out.println(custFunction.apply(cust1));
		
		Function<String,String> upperCaseFunction = st -> {return st.toUpperCase();};
		
		//created the Java8 Stream object
		//One of Stream operation is map() is used for transforming the data
		//map(Function)..... map method will take as parameter.
	    Stream.of("mahesh").map(upperCaseFunction).forEach(System.out::println);
	    Stream.of("mahesh kumar","Suresh","rajesh").map(st -> {return st.toUpperCase();}).forEach(System.out::println);
	}
}
