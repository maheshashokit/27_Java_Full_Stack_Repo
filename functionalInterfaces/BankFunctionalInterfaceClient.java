package com.ashokit.functionalInterfaces;

public class BankFunctionalInterfaceClient {
	
	public static void main(String[] args) {
		
		Bank sbiBank= (cash) -> {
			System.out.println("This is Implementation for SBI Bank....");
			System.out.println("Your Cash got Depoisted::::" + cash);
		};
		//calling the Sbi Bank implementation
		sbiBank.applySecurity();
		sbiBank.deposit(25000f);
		System.out.println("SBI BANK OTP GENERATION:::" +Bank.generateOTP());
		sbiBank.doScreenshot();
		
		System.out.println("*************************************************");
		Bank hdfcBank = cash -> {
			System.out.println("This is Implementation for HDFC Bank....");
			System.out.println("Your Cash got Depoisted::::" + cash);
		};
		//calling the HDFC Bank Implementation
		hdfcBank.applySecurity();
		hdfcBank.deposit(35000f);
		System.out.println("HDFC BANK OTP GENERATION:::" +Bank.generateOTP());
		hdfcBank.doScreenshot();
		
		System.out.println("*****************************************************");
		Bank iciciBank = cash -> {
			System.out.println("This is Implementation for ICICI Bank....");
			System.out.println("Your Cash got Depoisted::::" + cash);
		};
		//calling the ICICI Bank Implementation
		iciciBank.applySecurity();
		iciciBank.deposit(35000f);
		System.out.println("ICICI BANK OTP GENERATION:::" +Bank.generateOTP());
		iciciBank.doScreenshot();
		
		
		
	}

}
