package com.ashokit.exceptionhandling;

import java.util.Scanner;

public class AbnormalTerminationDemo {

	public static void main(String[] args) {
		
	     //Reading the Input From User through Keyboard
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter First Value");
		 int first = sc.nextInt();
		 System.out.println("Enter Second Value");
		 int second = sc.nextInt();
		 System.out.println("First   =" + first );
		 System.out.println("Second  =" + second);
		 //Risky Code
		 int third = first/second;
		 System.out.println("Division Result:::::" + third);
		 //close the scanner
		 sc.close();
	}
}
