package com.ashokit.threads;

public class Task1 implements Runnable {

	@Override
	public void run() {
		// Code for task 1
		System.out.println("Executing Task 1");
		for (int i = 1; i <= 20; i++) {
			System.out.println("Task-1 Execution::::" + i);
		}

	}

}
