package com.ashokit.functionalInterfaces;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerFunctionalInterfaceClient {
	
	public static void main(String[] args) {
		
		Customer cust1 = new Customer("AIT123","Mahesh","Hyderabad");
		
		Consumer<Customer> custConsumer = cust ->{
			System.out.println("Customer ID ::::" + cust.customerId);
			System.out.println("Customer Name ::::" + cust.customerName);
			System.out.println("Customer Location ::::" + cust.customerLocation);
		};
		//calling the consumer
		custConsumer.accept(cust1);
		
		Consumer<String[]> arrayConsumer = (String str[]) ->{
			for(String name : str) {
				System.out.println("Customer Name::::" + name);
			}
		};
		arrayConsumer.accept(new String[] {"Mahesh","Suresh","Rajesh"});
		
		Consumer<String> stringConsumer = st -> System.out.println(st);
		Stream.of("Mahesh","Suresh","Rajesh").forEach(eachName -> System.out.println(eachName));
		Stream.of("Mahesh","Suresh","Rajesh").forEach(stringConsumer);
	}
}
