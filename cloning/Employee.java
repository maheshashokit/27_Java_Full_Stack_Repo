package com.ashokit.cloning;

public class Employee implements Cloneable{
	
	public int empId;
	public String empName;
	
	//creating Address class object
	public Address add = new Address("1-2-3","Hyderabad");

	//Defining the constructors
	public Employee() {
	   System.out.println("Employee Class Public Non-Parameterized Constructor....");
	}
	public Employee(int empId, String empName) {
		System.out.println("Employee Class Public Parameterized Constructor....");
		this.empId = empId;
		this.empName = empName;
	}
		
	//Defining Business method
	public void displayEmployeeDetails() {
		System.out.println("Employee ID     ::::::" + empId);
		System.out.println("Employee Name   ::::::" + empName);
	}
	
	//overriding the clone method from java.lang.Object class
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		 
		Employee emp = (Employee) super.clone();
		
		 //Adding Deep Cloning Logic
		 emp.add = (Address) add.clone();
		
		return emp;
	}
}