package com.ashokit.threads;

//Producer Thread for Producing the data
public class Producer2 extends Thread{
	
	//Taking object for the adding the data
	public StringBuffer sb;
	
	//Defining the constructor
	public Producer2() {
		sb = new StringBuffer();
	}
	
	@Override
	public void run() {
		System.out.println("Producer2 Thread.......");
		synchronized (sb) {
			for (int i = 1; i <= 20; i++) {
				try {
					sb.append(i + " ");
					Thread.sleep(1000);
					System.out.println("Appending the data");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			// change the value of productionStatus
			sb.notify();
		}
		
	}
}
