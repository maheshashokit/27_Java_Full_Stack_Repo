//This is Generalized Class for Defining Watch Functionality
public class Watch {
	
	//Define Fields
	public int hours;
	public int minutes;
	public int seconds;
	
	//Public Non-Parameterized Constructor
	public Watch() {
		System.out.println("Watch Class Public Non-Parameterized Constructor....");
	}
	
	//Business method for setting Time
	public void setTimeForWatch(int hours,int minutes,int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	//Business method for displaying time information
	public void displayTimeForWatch() {
		System.out.println("Current Time " + hours+ " : "+ minutes+" : "+ seconds);
	}
	
	//Defining the private method to verify the visbility
	private void testPrivateMethod() {
		System.out.println("This is Form TestPrivate Method....");
	}
}