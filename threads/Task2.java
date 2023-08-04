package com.ashokit.threads;

public class Task2 implements Runnable {
	@Override
	public void run() {
		// Code for task 2
		System.out.println("Executing Task 2");
		for (int i = 1; i <= 20; i++) {
			if(i % 2 ==0) {
				System.out.println("Task-2 Execution::::" + i);
			}
		}
	}
}