
public class SingleInheritanceClient {

	public static void main(String[] args) {
		
		//creating the object for BasicWatch Class
		BasicWatch bw = new BasicWatch();
		
		//calling Parent class method using Child class object
		bw.setTimeForWatch(9, 12, 30);
		//calling Child class method using child class object
		bw.setDateForWatch(03, "May", 2023);
		
		//Display the values of Time and Date 
		//calling Parent class method using Child class object
		bw.displayTimeForWatch();
		//calling Child class method using child class object
		bw.displayDateForWatch();
		
		//Creating child class object and storing into parent class variable
		Watch wt = new BasicWatch();
		wt.setTimeForWatch(8, 58, 9);
		wt.displayTimeForWatch();
		
		//creating parent class object and storing into child class variable
		Watch wat = new BasicWatch();//upcasting
		//Downcasting
		BasicWatch bw1 = (BasicWatch)wat;
		bw1.setTimeForWatch(9, 1, 2);
		bw1.setDateForWatch(12,"MAY",2023);
		bw1.displayTimeForWatch();
		bw1.displayDateForWatch();
	
	}
}