package com.ashokit.functionalInterfaces;

public class Java8InterfaceEnhancementClient {
	
	public static void main(String[] args) {
		
		GooglePay payment = new GooglePay();
		payment.applySecurity();//accessing default method
		int otpPassword = Payment.generateOTP();
		System.out.println("GooglePay OTP::::::" + otpPassword);
		Payment.displayBalance();
		payment.doPayment();
		payment.getScratchCard();
		payment.doScreenshot();//accessing default method
		
		
		System.out.println("*********************************");
		PhonePe payment1 = new PhonePe();
		payment1.applySecurity();//accessing default method
		int otpPassword1 = Payment.generateOTP();
		System.out.println("PhonePe OTP::::::" + otpPassword1);
		Payment.displayBalance();
		payment1.doPayment();
		payment1.getScratchCard();
		payment1.doScreenshot();//accessing default method
		
		System.out.println("*********************************");
		
		Payment payment2 = new Paytm();
		payment2.applySecurity();//accessing default method
		payment2.doPayment();
		int otpPassword2 = Payment.generateOTP();
		System.out.println("Paytm OTP::::::" + otpPassword2);
		Payment.displayBalance();
		payment2.getScratchCard();
		payment2.doScreenshot();//accessing default method
	}

}
