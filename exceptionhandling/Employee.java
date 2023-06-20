package com.ashokit.exceptionhandling;

public class Employee implements AutoCloseable{
	
	public Employee() {
		System.out.println("Employee Class Default Constructor.......");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Employee Class Close()................");
	}

}
