package com.ashokit.threads;

public class ReservationDemoClient {
	
	public static void main(String[] args) {
		
	    //Creating the ReservationDemo Object
		ReservationDemo rd = new ReservationDemo(1); //wantedBerth count
		
	    //Creating the Multiple Threads for Representing Multiple Passengers
		Thread t1 = new Thread(rd);
		t1.setName("Mahesh Passenger");
		
		Thread t2 = new Thread(rd);
		t2.setName("Suresh Passenger");
		
		Thread t3 = new Thread(rd);
		t3.setName("Rajesh Passenger");
		
		//start the threads
		t1.start();
		t2.start();
		t3.start();
	}
}
