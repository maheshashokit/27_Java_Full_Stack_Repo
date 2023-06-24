package com.ashokit.exceptionhandling;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test {
	
	public static void main(String[] args) {
		
		 Queue<String> queue = new LinkedList<>();

	        // Adding elements to the queue
	        queue.add("Apple");
	        queue.add("Apple");
	        queue.offer("Banana");
	        queue.add("Cherry");
	        queue.add("Cherry");

	        // Removing elements from the queue
	        String element = queue.remove(); // Removes and returns "Apple"
	        String polledElement = queue.poll(); // Removes and returns "Banana"

	        System.out.println(element +"====>" + polledElement);
	        // Retrieving the element at the front of the queue
	        String frontElement = queue.element(); // Returns "Cherry"
	        String peekedElement = queue.peek(); // Returns "Cherry"
	        
	        System.out.println(frontElement + "=====>" + peekedElement);
	      
	        // Printing the queue
	        System.out.println(queue); // Outputs: [Cherry]
	        
	        ArrayList al = new ArrayList();
	        al.add("Ganesh");
	        al.add("Ganesh");
	        al.add("Ganesh");
	        al.add("Ganesh");
	        al.add("Ganesh");
	        al.add("Ganesh");
	        
	        System.out.println("ArrayList Size:::::" + al.size());
	        al.ensureCapacity(10);
	        System.out.println("ArrayList Size:::::" + al.size());
	}
}