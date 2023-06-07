package com.ashokit.functionalInterfaces;

public class InheritanceFunctionalInterfaceClient {
	
	public static void main(String[] args) {
		
 		ParentFunctionalInterface pfi = () -> System.out.println("This is implementation of Parent class Display....");
		pfi.display();
		
		ChildFunctionalInterface cfi = () -> System.out.println("This is implemenation of Child Class Display....");
		cfi.display();
	}

}
