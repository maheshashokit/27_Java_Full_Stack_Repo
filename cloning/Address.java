package com.ashokit.cloning;

public class Address implements Cloneable{
	
	public String doorNo;
	public String cityName;
	
	public Address() {
		System.out.println("Address Class public Non-Parameterized Constructor....");
	}
	
	public Address(String doorNo, String cityName) {
		System.out.println("Address Class public Parameterized Constructor");
		this.doorNo = doorNo;
		this.cityName = cityName;
	}
	
	public void displayAddressDetails() {
		System.out.println("DoorNo    :::::" + doorNo);
		System.out.println("CityName  :::::" + cityName);
	}
	
	@Override
	protected Address clone() throws CloneNotSupportedException {
		Address add = (Address) super.clone();
		
		return add;
	}
}