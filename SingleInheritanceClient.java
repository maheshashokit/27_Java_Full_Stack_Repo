
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
	}
}