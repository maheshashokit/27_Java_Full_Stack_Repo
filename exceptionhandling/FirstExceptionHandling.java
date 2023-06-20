package com.ashokit.exceptionhandling;

public class FirstExceptionHandling {
	
	public static void main(String[] args) {		
		int a  = 10;
		int b  = 20;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		int c  = 25/10;
		System.out.println("Division Result ::::" + c);
		System.out.println("End of Java Program.....");
		display();
	}
	
	public static void display() {
		int a=10 ;
		int b=1,c=20;
		System.out.println("a =" + a);
		System.out.println("b ="+ b);
		System.out.println("c = + c");		
		int arr[] = {10,20,30};
		System.out.println(arr[5]);
		System.out.println("ArrayIndex Error.......");
	}
	
}