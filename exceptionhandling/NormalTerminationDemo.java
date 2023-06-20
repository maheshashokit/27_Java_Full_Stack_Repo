package com.ashokit.exceptionhandling;

import java.util.Scanner;

public class NormalTerminationDemo {
	
	public static void main(String[] args) {
		//Reading the Input From User through Keyboard
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter First Value");
		 int first = sc.nextInt();
		 System.out.println("Enter Second Value");
		 int second = sc.nextInt();
		 System.out.println("First   =" + first );
		 System.out.println("Second  =" + second);
		 
		 int third = 0,parsedValue=0;
		 int arr[] = {10,20,30,40,50};
		 
		 //This is get riding of NullPointer Exception
		 String name = "Mahesh";
		 if(name != null && !name.isEmpty()) {
			 System.out.println("Name Length :::::" + name.length());
		 }else {
			 System.out.println("Name property doesn't have any value......");
		 }
		 
		 //get riding the ArrayIndexOutOfBoundsException
		 System.out.println("Length Array ::::" + arr.length); //5
		 if(arr.length > 0 && arr.length <= 5) {
			 System.out.println("Array Element:::::::" + arr[40]);
		 }
		 
		 try{
			 third = first/second;  //1) No Exception in Try Block(25,2)  2) If Exception got in try block(25,0)
			 //System.out.println("Accessing Array Elements:::::" + arr[4]);  //ArrayIndexOutofBoundsException
			 //converting the string value into primitive value
			 parsedValue = Integer.parseInt("1"); //NumberFormatException
			 System.out.println("1232333333333333333333333333333333333333333333");
			
		 }catch(NullPointerException npe) {
			 System.out.println("Inside the NullPointerException catch block...."+ npe);
		 }catch(ArithmeticException ae) {
			 System.out.println("Inside the ArithMeticException catch block....." + ae);
		 }catch(ArrayIndexOutOfBoundsException aie) {
			 System.out.println("Inside the ArrayIndexOutOfBoundsException catch Block....." + aie);
		 }catch(NumberFormatException ne) {
			 System.out.println("Inside the NumberFormatException Catch block....." + ne);
		 }finally {
			 System.out.println("Compulsory Executed Block.....");
			 if(sc != null) sc.close();
		 }
		 System.out.println("Divison Operation Between Two Variables::::" + third);
		 System.out.println("Conversion Value:::::" + parsedValue);
		 
		 
	}

}
