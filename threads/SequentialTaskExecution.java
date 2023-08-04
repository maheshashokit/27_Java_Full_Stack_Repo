package com.ashokit.threads;

public class SequentialTaskExecution {
	
	public static void main(String[] args) {
		
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		Task3 t3 = new Task3();
		
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		Thread tt3 = new Thread(t3);
		
		try {
			//Executing the First task
			tt1.start();
			tt1.join();
			
			//Executing the Second Task
			tt2.start();
			tt2.join();
			
			//Executing the Third Task
			tt3.start();
			tt3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
