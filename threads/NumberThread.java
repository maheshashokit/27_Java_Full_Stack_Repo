package com.ashokit.threads;

public class NumberThread extends Thread{
	
	private int loopNumber;
	
	//Parameterized constructor 
	public NumberThread(int loopNumber) {
		this.loopNumber = loopNumber;
	}

	@Override
	public void run() {		
		//Thread based logic for printing the Numbers
		for(int i = 1 ; i<=loopNumber ;i++) {
			System.out.println("Current Thread:::::" + Thread.currentThread().getName());
			System.out.println("i =" + i);
		}
	}
	
	public static void main(String[] args) {
		
		//Creating the Object for NumberThread class
		NumberThread nt  =  new NumberThread(10);
		//setting name for Threads
		nt.setName("Mahesh");
		
		NumberThread nt1  = new NumberThread(20);
		//setting name for Threads
		nt1.setName("Ashok");
		
		//call the start() to execute thread based logic
		nt.start();
		nt1.start();
	}
}
