package com.ashokit.exceptionhandling;

public class ExceptionPropagationExample {

	public static void main(String[] args) {
		try {
			method1();
			System.out.println("Hi");
		} catch (Exception e) {
			System.out.println("Exception caught in main method: " + e.getMessage());
		}
	}

	public static void method1() throws Exception {
			method2();
	}

	public static void method2() throws Exception {
		method3();
	}

	public static void method3()throws Exception{
		// Simulating an exception
		throw new Exception("Exception occurred in method3");
	}
}