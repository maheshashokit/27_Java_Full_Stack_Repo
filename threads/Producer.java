package com.ashokit.threads;

//Producer Thread for Producing the data
public class Producer extends Thread{
	
	//Taking object for the adding the data
	public StringBuffer sb;
	
	//Taking the Flag variable for maintaining the status
	public boolean productionStatus = false;
	
	//Defining the constructor
	public Producer() {
		sb = new StringBuffer();
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			try {
				System.out.println(Thread.currentThread().getName());
				sb.append(i + " ");
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// change the value of productionStatus
		productionStatus = true;
	}
}
