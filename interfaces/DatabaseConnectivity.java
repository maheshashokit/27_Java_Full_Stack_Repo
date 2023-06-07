package com.ashokit.interfaces;

public interface DatabaseConnectivity {
	
	public static final String databaseName="Oracle";
	
	public abstract String connectToDatabase(String databaseVersion,String databaseName);
}