package com.ashokit.exceptionhandling;

import java.io.Closeable;
import java.io.IOException;

public class Customer implements Closeable{
	
	public Customer() {
		System.out.println("Customer Class Default Constructor.....");
	}
	
	@Override
	public void close() throws IOException {
		System.out.println("Inside Close() method from Customer class...");
	}
}