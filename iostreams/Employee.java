package com.ashokit.iostreams;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = 7089663070124444239L;

	public String eId;

	public String eName;

	public transient String location;
	
	public static String companyName="AshokIT";
	
	public Employee() {
		System.out.println("Employee Class Default Constructor.....");
	}

	public Employee(String eId, String eName, String location) {
		this.eId = eId;
		this.eName = eName;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", location=" + location + "]";
	}

}
