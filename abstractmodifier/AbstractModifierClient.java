package com.ashokit.abstractmodifier;

public class AbstractModifierClient {
	
	public static void main(String[] args) {
		
		//Creating the sub class object and holding into parent class variable
		DatabaseConnectivity dc = new OracleDatabaseConnectivity("Oracle DB","21C");
		
		//calling the subclass implementation method of an abstract method
		System.out.println(dc.connectToDatabase());
		
		//calling the business method for displaying database name and version
		dc.showDatabaseDetails();
		
		System.out.println("********************************************");
		dc = new DB2DatabaseConnectivity("IBM DB2","10.X");
		
		//calling the subclass implementation method of an abstract method
		System.out.println(dc.connectToDatabase());
		
		//calling the business method for displaying database name and version
		dc.showDatabaseDetails();
		
		//Proving the abstract class object instantiation is possible or not
		//DatabaseConnectivity dc1 = new DatabaseConnectivity(); //Cannot instantiate the type DatabaseConnectivity
		
	}
}
