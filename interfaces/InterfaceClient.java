package com.ashokit.interfaces;

public class InterfaceClient {

	public static void main(String[] args) {
		
		//creating the object for implementation classes
		OracleDatabaseConnectivity odc  = new OracleDatabaseConnectivity();
		System.out.println(odc.connectToDatabase("21C","Oracle"));
		
		//creating the object for implementation classes
		DB2DatabaseConnectivity ddc  = new DB2DatabaseConnectivity();
		System.out.println(ddc.connectToDatabase("10X","DB2"));
		
		//creating the object for implementation classes
		DatabaseConnectivity odc1  = new OracleDatabaseConnectivity();
		System.out.println(odc.connectToDatabase("19C","Oracle"));
	}
}
