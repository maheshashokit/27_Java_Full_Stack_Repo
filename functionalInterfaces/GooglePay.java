package com.ashokit.functionalInterfaces;

public class GooglePay implements Payment {
	
	@Override
	public void doPayment() {
		System.out.println("GooglePay doPayment()....");
	}
	
	@Override
	public void getScratchCard() {
		System.out.println("GooglePay getScratch().....");
	}
}
