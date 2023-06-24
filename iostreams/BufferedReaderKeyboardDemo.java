package com.ashokit.iostreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderKeyboardDemo {
	
	public static void main(String[] args) throws IOException{
		
		//InputStreamReader
		InputStreamReader isr = new InputStreamReader(System.in);
		
		//Creating BufferedReader
		BufferedReader br = new BufferedReader(isr);
	
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Customer Id");
		String custId = br.readLine();
		System.out.println("Enter Customer Name");
		String custName = br.readLine();
		System.out.println("Enter Bill Amount");
		float billAmount = Float.parseFloat(br.readLine());
		
		System.out.println("Customer Id :::::" + custId);
		System.out.println("Customer Name :::::" + custName);
		System.out.println("Customer Bill :::::" + billAmount);
	}
}