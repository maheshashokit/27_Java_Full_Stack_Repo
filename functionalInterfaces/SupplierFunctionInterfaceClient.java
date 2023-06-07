package com.ashokit.functionalInterfaces;

import java.util.Date;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierFunctionInterfaceClient {
	
	public static void main(String[] args) {
		
		Supplier<Customer> custSuplier = () -> {
			return new Customer("AIT2323","Mahesh","Pune");
		};
		
		Supplier<Date> dateSupplier = () ->{
			return new java.util.Date();
		};
		
		Supplier<Integer> randomNumberSupplier =() ->{
			return new Random().nextInt(2500, 3600);
		};
		
		//Executing the Supplier abstract method
		System.out.println("Customer::::" + custSuplier.get().customerId);
		System.out.println("Customer::::" + custSuplier.get().customerName);
		System.out.println("Customer::::" + custSuplier.get().customerLocation);
		
		System.out.println();
		System.out.println("Date::::" + dateSupplier.get());
		
		System.out.println();
		System.out.println("Random::::" + randomNumberSupplier.get());
		
		Stream.generate(dateSupplier).limit(5).forEach(random -> System.out.println(random));
	}
}
