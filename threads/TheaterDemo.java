package com.ashokit.threads;

public class TheaterDemo extends Thread{
	
     //To Hold the Task name(ValidatingTicket,Showing Seat)
	 private String taskName;
	 
	 //Defining the constructor
	 public TheaterDemo(String taskName) {
		 this.taskName = taskName;
	 }
	 
	@Override
	public void run() {
		//Writing the logic for validating ticket & Showing Seat for 20 Customers
		for(int i =1 ; i<=20; i++) {
			System.out.println(taskName + "-" + i);
			try {
				//Waiting for some amount time to execute other task
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}