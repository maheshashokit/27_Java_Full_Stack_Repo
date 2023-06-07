package com.ashokit.functionalInterfaces;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateFuncationInterfaceDemo {
	
	public static void main(String[] args) {
		
		Predicate<String>  loginPredicate = username -> {
		    return username != null && "Mahesh".equalsIgnoreCase(username);
		};
		
		//executing the login predicate
		System.out.println(loginPredicate.test("Mahesh Kumar"));
		System.out.println(loginPredicate.test("Mahesh"));
		System.out.println(loginPredicate.test("Suresh"));
		
		Predicate<String> lengthPredicate = name ->{ return name.length() > 5;};
		
		//created the Java8 Stream object
		//One of Stream operation is filter() is used for filtering the data
		//filter(Predicate)..... filter method will take as parameter.
		Stream.of("Uma").filter(lengthPredicate).forEach(System.out::println);
		System.out.println();
		Stream.of("Uma","Rajesh","Test","Suresh").filter(lengthPredicate).forEach(System.out::println);
		
		Predicate<Integer> numberPredicate = testNumber -> {
			return testNumber > 0;
		};
		System.out.println("Number Predicate:::" + numberPredicate.test(-5));
	}
}