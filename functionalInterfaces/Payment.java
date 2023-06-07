package com.ashokit.functionalInterfaces;

import java.util.Random;

//Normal Interface
public interface Payment {
	
	public void doPayment();
	
	public void getScratchCard();
	
	public default void doScreenshot() {
		System.out.println("All Payment Systems Required this Screeshot Implementation....");
	}
	
	public default void applySecurity() {
		System.out.println("All Payment Systems Required the Security......");
	}
	
	public static void displayBalance() {
		System.out.println("This is Display Balance Method.......");
	}
	
	public static int generateOTP() {
		//generating 4 digit random numbers...
		return new Random().nextInt(1001, 5000);
	}
}
