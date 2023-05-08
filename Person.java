public class Person {

	// Defining the Fields
	public String name;
	public String emailId;
	public String contactNo;

	//Defining business method for setting values of an Person
	public void setPersonDetails(String name, String emailId, String contactNo) {
		this.name = name;
		this.emailId = emailId;
		this.contactNo = contactNo;
	}

	//Defining the business method for displaying Person values
	public void displayPersonalDetailsInfo() {
		System.out.println("*********Personal Information********************");
		System.out.println("Name ::" + name + " EmailID ::" + emailId + " ContactNo ::" + contactNo);
	}
}