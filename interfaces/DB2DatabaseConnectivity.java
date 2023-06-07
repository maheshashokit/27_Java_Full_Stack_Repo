package com.ashokit.interfaces;

public class DB2DatabaseConnectivity implements DatabaseConnectivity{

	@Override
	public String connectToDatabase(String databaseVersion, String databaseName) {
		return String.format("Database Connectivity got Completed with Database Name %s with Database Version %s", databaseName,databaseVersion);
	}
}