package com.ashokit.threads;

public class ReservationDemo extends Thread{
	
	//Defining the variables for availableBerths,WantedBerths
	private int availableBerths = 1;
	private int wantedBerths;
	
	//Defining the Constructors
	public ReservationDemo(int wantedBerths) {
		this.wantedBerths = wantedBerths;
	}
	
	//overriding the run() for defining thread based logic
	@Override
	public void run() {		
		//sharedLogic();
		synchronized (ReservationDemo.class) {
			System.out.println("Available Berths:::::" + availableBerths);
			if(availableBerths >= wantedBerths) {
				//Process the logic for allocating the berth
				String passengerName = Thread.currentThread().getName();
				
					System.out.println(passengerName+ " Allocating the Berth........");
					
					//For printing the ticket we have holded task for certain amount of time
					try {
						Thread.sleep(5000);
						
						//Modifying the availableBerth Count......
						availableBerths = availableBerths-wantedBerths;
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			 }else {
					System.out.println("Sorry,Required Berths are not available in Train....");
			}
		}
	}
	
	public synchronized void sharedLogic() {
		System.out.println("Available Berths:::::" + availableBerths);
		if(availableBerths >= wantedBerths) {
			//Process the logic for allocating the berth
			String passengerName = Thread.currentThread().getName();
			System.out.println(passengerName+ " Allocating the Berth........");
			
			//For printing the ticket we have holded task for certain amount of time
			try {
				Thread.sleep(5000);
				
				//Modifying the availableBerth Count......
				availableBerths = availableBerths-wantedBerths;
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}else {
			System.out.println("Sorry,Required Berths are not available in Train....");
		}
	}
}