
public class Passenger {
	
	//Defining the Fields
	private String name;
	private String email;
	private String contactNo;
	
	//Has-a Relationship
	public Address add = new Address();
	
	//Defining the public constructor
	public Passenger() {
		System.out.println("Passenger Class Public Constructor");
	}
	
	//Defining the public Parameterized constructor
	public Passenger(String name,String email,String contactNo) {
		System.out.println("Passenger Class Public Parameterized Constructor");
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
	}
	
	//Defining the Business method for displaying Passenger Information
	public void displayPassengerDetails() {
		System.out.println("Name::" + name+ " Email::" +email+" ContactNo::" + contactNo);
	}
}
