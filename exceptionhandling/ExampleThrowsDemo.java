package com.ashokit.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExampleThrowsDemo {

	public static void main(String[] args) {
		
		try {
			int divisionResult = division(10, 0);
			System.out.println("Division Result :::::" + divisionResult);
		}catch (ArithmeticException ae) {
			System.out.println("Error Reason::::" + ae);
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("Array Error Reason :::::" + aie);
		} catch (Exception e) {
			System.out.println("General Exception Conditrion"+ e);
		}
		System.out.println("End of Java Program");
		
	}
	
	public static void testDivision() {
		int result = division(25,0);
		System.out.println("Result ::::" + result);
	}
	
	
	public void test() throws CloneNotSupportedException, FileNotFoundException {
		clone();
		FileInputStream fis = new FileInputStream("src/mahesh.txt");
	}
	
	public static int division(int a , int b) {
		if(b == 0) {
			throw new ArithmeticException("Division Is Not Possible because Denominator should be greater than 0");
		}
		return a /b;
	}	
}
