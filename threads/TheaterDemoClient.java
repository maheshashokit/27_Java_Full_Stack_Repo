package com.ashokit.threads;

public class TheaterDemoClient {
	
	public static void main(String[] args) {
		
		//Representing the two tasks....
		TheaterDemo td1 = new TheaterDemo("Validating Ticket....");
		TheaterDemo td2 = new TheaterDemo("Showing Seat.....");
		
		//Creating the threads for executing multiple tasks
		Thread t1 = new Thread(td1);
		Thread t2 = new Thread(td2);
		
		//Start executing the threads
		t1.start();
		t2.start();
	}
}