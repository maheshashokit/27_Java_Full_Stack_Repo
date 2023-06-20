package com.ashokit.exceptionhandling;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class TryWithResourcesDemo {
	
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
			System.out.println("Accessing Array Element:::::" + arr[4]);
			
			System.out.println("Employee ID :::::" + employeeId);
			System.out.println("Employee Name :::::" + employeeName);
			
		}catch(NullPointerException e) {
			System.out.println("Error Occured During Logic Execution ::::" + e);
		}catch(NumberFormatException ne) {
			System.out.println("Error Occured During NumberFormat Exception:::::" + ne);
		}catch(RuntimeException re) {
			System.out.println("RunTimeException Block:::::" + re);
		}catch(Exception e) {
			System.out.println("Inside the Exception Block:::::::" + e);
		}
		String st = "Welcome To Ashok IT";
		System.out.println(Arrays.toString(st.getBytes()));
	}

}
