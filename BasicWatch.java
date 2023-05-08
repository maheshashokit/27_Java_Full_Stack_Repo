//This is specialized class for defining BasicWatch Functionality
public class BasicWatch extends Watch {
	
	//Defining the Fields
	public int day;
	public String month;
	public int year;
	
	//Public Non-Parameterized Constructor
	public BasicWatch() {
		System.out.println("BasicWatch Class Public Non-Parameterized Constructor....");
	}
	
	//Business method for setting Time
	public void setDateForWatch(int day,String month,int year) {
		this.day = day;
		this.month = month;
		this.year =year;
	}
	
	//Business method for displaying Date information
	public void displayDateForWatch() {
		System.out.println("Current Date " + day+ " - "+ month+" - "+ year);
	}
}