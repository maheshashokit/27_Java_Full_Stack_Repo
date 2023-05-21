
public class Test extends Demo {
	
	//same Field also availabile in Parent Class
	public String message="Mahesh IT";
	
	public Test() {
		//Giving call to Parent class public Constructor
		//super(); //Here Parent class Non-Param Constructor gets executed
		//super("Welcome To Ashok IT");
		System.out.println("Test");
	}
	
	public Test(String message) {
		super(message); //Giving call to Parent class Param Constructor....
	}	
	
	//We have same method similar to Parent class
	public void display() {
		System.out.println("Message :::" + message);
		//System.out.println("Super Message :::" + super.message);
		super.display();
	}
}