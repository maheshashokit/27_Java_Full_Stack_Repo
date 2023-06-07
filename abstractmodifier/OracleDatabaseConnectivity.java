package com.ashokit.abstractmodifier;

public class OracleDatabaseConnectivity extends DatabaseConnectivity {

	//Defining the constructors
	public OracleDatabaseConnectivity() {
		System.out.println("OracleDatabaseConnectivity Class Non-Param Constructor...");
	}
	
	public OracleDatabaseConnectivity(String databaseName,String dbVersion) {
		//passing the databaseName & dbVersion from Subclass constructor to super class constructor
		super(databaseName,dbVersion);
	}
	
	@Override
	public String connectToDatabase() {
		//First %s is representing databaseName
		//Second %s is representing databaseVersion
		return String.format("Database Connected %s and version is %s",super.databaseName,super.dbVersion);
	}

}
