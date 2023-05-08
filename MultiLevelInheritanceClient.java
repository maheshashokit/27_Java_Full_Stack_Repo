
public class MultiLevelInheritanceClient {

	public static void main(String[] args) {
		
		//creating the object for SmartWatch class
		SmartWatch sw = new SmartWatch();
		
		//calling time functionality from grand Parent class
		sw.setTimeForWatch(8, 53, 39);
		
		//calling date functionality from parent class
		sw.setDateForWatch(04, "MAY", 2023);
		
		//calling Temperature functionality from SmartWatch class only
		sw.setTemperatureForSmartWatch(42.52d);
		
		//calling time display method from grand parent class
		sw.displayTimeForWatch();
		
	    //calling date display method from parent class
		sw.displayDateForWatch();
		
		//calling temperature display method from SmartWatch class
		sw.displayTemperatureInfo();
		//calling additional business method from SmartWatch Class
		sw.displayHealthInfo();
		
		//Accessing super grand parent properties(java.lang.Object)
		System.out.println("Super Grand Parent Methods :::::" + sw.hashCode());
	}
}