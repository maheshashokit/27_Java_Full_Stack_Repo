package com.ashokit.functionalInterfaces;

//Normal Interface with Default method
public interface A {
	
	public default void display() {
		System.out.println("A Interface Display Method");
	}
	
	public static void start() {
		System.out.println("A Interface Start.....");
	}
	
	public void test();
}
