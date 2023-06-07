package com.ashokit.functionalInterfaces;

public class Paytm implements Payment {
	
	@Override
	public void doPayment() {
		System.out.println("Paytm doPayment()....");
	}
	
	@Override
	public void getScratchCard() {
		System.out.println("Paytm getScratch().....");
	}
}
