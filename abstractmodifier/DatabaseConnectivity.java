package com.ashokit.abstractmodifier;

//Defining the Abstract class given by sunMicrosystem for Just Assumption
public abstract class DatabaseConnectivity {

	public String databaseName;
	public String dbVersion;
	
	//Defining the non-parameterized constructor
   public DatabaseConnectivity() {
	   System.out.println("DatabaseConnectivity Class public Constructor....");
   }
   
   //Defining the parameterized constructor
   public DatabaseConnectivity(String databaseName,String dbVersion) {
	   System.out.println("DatabaseConnectivity class public Parameterized Constructor....");
	   this.databaseName= databaseName;
	   this.dbVersion= dbVersion;
   }
   
   //Defining the abstract method
   public abstract String connectToDatabase();
   
   //Defining business method for displaying databaseName
   public void showDatabaseDetails() {
	   System.out.println("Database Name    ::::" + databaseName);
	   System.out.println("Database Version ::::" + dbVersion);
   }
}
