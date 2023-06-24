package com.ashokit.iostreams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class SerializableDemo {
	
	public static void main(String[] args) {
		
		//creating the Employee class object
		Employee emp  = new Employee("AIT123","Mahesh","Hyderabad");
		Employee emp1 = new Employee("AIT345","Ashok","Delhi");
		Employee emp2 = new Employee("AIT567","Suresh","Delhi");
		Employee emp3 = new Employee("AIT987","Naresh","Delhi");
		Employee emp4 = new Employee("AIT3125","Rajesh","Delhi");
		
		//Creating the FileOutputStream for Storing Serialized Content
		try(FileOutputStream fos = new FileOutputStream("src/employee.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);){
			
			//writing the object into oos 
			oos.writeObject(emp);
			oos.writeObject(emp1);
			oos.writeObject(emp2);
			oos.writeObject(emp3);
			oos.writeObject(emp4);
			
			System.out.println("Employee Class Objects are Serialized.......");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
