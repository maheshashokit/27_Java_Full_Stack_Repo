//This class is for creating SmartWatch Functionality
public class SmartWatch extends BasicWatch {
	
	//Defining Fields of SmartWatch
	public double temperatureDegrees;
	
	//Defining the public non-parameterized Constructor
	public SmartWatch() {
		System.out.println("SmartWatch Class public non-parameterized constructor....");
	}
	
	//Defining the Parameterized Constructor for intialization
	public SmartWatch(double temperatureDegress) {
		this.temperatureDegrees = temperatureDegress;
	}	

	//Defining the Business method for setting temperature of SmartWatch
	public void setTemperatureForSmartWatch(double temperatureDegrees) {
		this.temperatureDegrees = temperatureDegrees;
	}
	
	public void displayTemperatureInfo() {
		System.out.println("Temperature:::" + temperatureDegrees);
	}
	
	//Defining Business method for displaying health information
	public void displayHealthInfo() {
		System.out.println("Displaying the Health Informaton From SmartWatch.....");
	}
}