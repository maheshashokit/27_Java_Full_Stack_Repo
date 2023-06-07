package com.ashokit.cloning;

public class CloningClient {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		System.out.println("**************Main Object ********************");
		Employee emp  = new Employee(123,"Ashok");
		emp.displayEmployeeDetails();
		System.out.println("Main Object Hashcode:::::::" + emp.hashCode());//212628335
		System.out.println("*********Address object **********************");
		emp.add.displayAddressDetails();
		System.out.println("Main Object of Dependent Object Hashcode:::::" + emp.add.hashCode());//2323232
		
		System.out.println("************ Cloned Object ******************");
		Employee emp1  = emp.clone();
		emp1.displayEmployeeDetails();
		System.out.println("Cloned Object Hashcode::::::"+ emp1.hashCode());//1579572132
		System.out.println("*********Address object **********************");
		emp1.add.displayAddressDetails();		
		System.out.println("Cloned Object of Dependent Object Hashcode:::::" + emp1.add.hashCode());//2323232
				
		System.out.println("************Programmer Doing the Changes in address obj through Cloned Object*****************");
		emp1.add.cityName ="PUNE";
		emp1.add.displayAddressDetails();
		System.out.println("City Name of Cloned Object:::::" + emp1.add.cityName);
		System.out.println("******Verifying the Main object of Dependent Object********");
		emp.add.displayAddressDetails();
		
		if(emp.add.hashCode() == emp1.add.hashCode()) {
			System.out.println("Shallow Cloning");
		}else {
			System.out.println("Deep Cloning");
		}
	}
}