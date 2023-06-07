package com.ashokit.functionalInterfaces;

//implementation class for duplicate abstract & default & static methods
public class DuplicateInterface implements A,B{

	@Override
	public void test() {
		System.out.println("Diamond problem implementation");
	}

	@Override
	public void display() {
		A.super.display();
	}
}