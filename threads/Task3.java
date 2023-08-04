package com.ashokit.threads;

public class Task3 implements Runnable {
	@Override
	public void run() {
		// Code for task 3
		System.out.println("Executing Task 3");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.println("Task-3 Execution::::" + i);
			}
		}
	}
}