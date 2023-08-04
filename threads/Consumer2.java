package com.ashokit.threads;

public class Consumer2 extends Thread{
	
	//Defining the Has-a Relationship
	private Producer2 producer;
	
	//Defining the Consumer
	public Consumer2(Producer2 producer) {
		this.producer = producer;
	}
	
	@Override
	public void run() {
		System.out.println("Consumer Thread Access.......");
		synchronized (producer.sb) {
			try {
				producer.sb.wait(100);
				//producer.sb.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//Reading the data from StringBuffer
			System.out.println("Consumer Data::::::" + producer.sb);
		}
	}
}