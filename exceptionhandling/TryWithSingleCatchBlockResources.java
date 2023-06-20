package com.ashokit.exceptionhandling;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class TryWithSingleCatchBlockResources {
	
	public static void main(String[] args) {
		
		
		try(Scanner sc = new Scanner(System.in);
			FileOutputStream fos = new FileOutputStream("src/mahesh.txt");
		    FileWriter fw = new FileWriter("src/Ashokit.txt");
			Employee emp = new Employee();
		    Customer cust = new Customer();){
			
			System.out.println("Enter Employee ID ");
			int employeeId = sc.nextInt();
			System.out.println("Enter Employee Name ");
			String employeeName = sc.next();
			
			int arr[] = {1,2,3,4,6}; //5 & //0-4 Indexing
			System.out.println("Accessing Array Element:::::" + arr[6]);
			
			System.out.println("Employee ID :::::" + employeeId);
			System.out.println("Employee Name :::::" + employeeName);
			
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e) {
			System.out.println("Inside the Exception Handling logic:::::" + e);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
