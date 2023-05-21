
public class HierarchicalInheritanceClient {
	
	public static void main(String[] args) {
		
		//Creating Object for Trainer class
		Trainer t = new Trainer(122,"Java",6.5f); 		
		//Calling super class method using trainer object
		t.setPersonDetails("Mahesh", "Mahesh.ashokit@gmail.com", "1234567890");		
		//calling the display method for values
		t.displayPersonalDetailsInfo();
		t.displayTrainerDetails();
		
		System.out.println("========================================================");
		
		//Creating Object for Developer Class
		Developer dev = new Developer("Java",5.3f,25000.00d);
		//Using dev class object accessing parent class methods
		dev.setPersonDetails("Ashok", "ashokitschools@gmail.com", "1111111");
		//calling the display method for values
		dev.displayPersonalDetailsInfo();
		dev.displayDeveloperInformation();
		
		//printing the Trainer Object
		 System.out.println(t.toString());
		 //printing the Developer Object
		 System.out.println(dev.toString());
		 System.out.println("Company Name::::" + Employee.companyName);
	}
}
