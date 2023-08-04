package com.ashokit.threads;

public class Consumer extends Thread{
	
	//Defining the Has-a Relationship
	private Producer producer;
	
	//Defining the Consumer
	public Consumer(Producer producer) {
		this.producer = producer;
	}
	
	
	@Override
	public void run() {
		//productionStatus is not true means Data production is not yet completed
		System.out.println("Consumer Thread Execution......");
		while(!producer.productionStatus) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Reading the data from StringBuffer
		System.out.println("Consumer Data::::::" + producer.sb);
		
		//Reset the productionStatus flag....
		producer.productionStatus= true;
	}
}