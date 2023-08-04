package com.ashokit.threads;

import java.util.stream.IntStream;

public class RunnableThreadDemo {
	
	public static void main(String[] args) {
		
		//Runnable interface from Java8 onwards as Functional Interface.
		//We can provide the implementation of abstract method of an Interface through LE
		
		 //Creating thread based logic for displaying even numbers
		 Runnable evenNumberTask = () ->{
		                              IntStream.range(1, 31)
		                             .filter(eachNumber -> {return eachNumber % 2 == 0;})
		                             .forEach(eachNumber -> {
		                            	 System.out.println("Current Thread Name:::" + Thread.currentThread().getName());
		                            	 System.out.println("Even Number:::" +eachNumber); 
		                             });
		 };
		
		 Runnable oddNumberTask = () ->{
						              IntStream.range(1, 31)
						             .filter(eachNumber -> {return eachNumber % 2 != 0;})
						             .forEach(eachNumber -> {
						            	 System.out.println("Current Thread Name:::" + Thread.currentThread().getName());
						            	 System.out.println("Odd Number::::" + eachNumber); 
						             });
		 };
		 
		 //Creating the Thread objects
		 Thread t1 = new Thread(evenNumberTask);
		 t1.setName("Even Number Task...");
		 Thread t2 = new Thread(oddNumberTask);
		 t2.setName("Odd Number Task...");
		 
		 //starting the execution
		 t1.start();
		 t2.start();
	}
}
