package com.ashokit.threads;

public class ThreadCommunicationClient2 {
	
	public static void main(String[] args) {
		
		//Creating the Producer Object
		Producer2 prod = new Producer2();
		
		//Creating the Consumer Object
		Consumer2 cons = new Consumer2(prod);
		
		//Creating two threads for executing Producer & Consumer Objects
		Thread t1 = new Thread(prod);
		t1.setName("Producer Thread");
		Thread t2 = new Thread(cons);
		t2.setName("Consumer Thread");
		
		//Start executing the Threads
		t2.start();
		t1.start();
	}
}