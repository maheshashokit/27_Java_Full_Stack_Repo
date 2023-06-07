package com.ashokit.functionalInterfaces;

public class FunctionalInterfaceClient {
	
	public static void main(String[] args) {

	    Addition addition  = (a,b) -> {
	    	                       return a+b;
	                         };
	    //calling the interface method to get executed Lambda Expression
	    System.out.println(addition.add(35, 25));
	   
	}
}