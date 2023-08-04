package com.ashokit.threads;

public class ThreadCommunicationClient {
	
	public static void main(String[] args) {
		
		//Creating the Producer Object
		Producer prod = new Producer();
		
		//Creating the Consumer Object
		Consumer cons = new Consumer(prod);
		
		//Creating two threads for executing Producer & Consumer Objects
		Thread t1 = new Thread(prod);
		t1.setName("Producer Thread");
		Thread t2 = new Thread(cons);
		t2.setName("Consumer Thread");
		
		//Start executing the Threads
		t1.start();
		t2.start();
	}
}