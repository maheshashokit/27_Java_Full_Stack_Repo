public class Mobile {
	
	//Declaring the Fields
	private String modelNo;
	private double price;
	private String companyName;
	
	//Defining the Constructor
	public Mobile() {
		System.out.println("Mobile Class Non-Parameterized Constructor.......");
	}
	
	//Defining the Parameterized Constructor
	public Mobile(String mobileModel,double mobilePrice,String compName) {
		System.out.println("Mobile Class Three Parameterized Constructor......");
		modelNo = mobileModel;
		price = mobilePrice;
		companyName = compName;
	}
	
	//It will call Non-Parameterized Constructor and we are not sending any data
	public Mobile(String mobileModel,String compName,double mobilePrice) {
		System.out.println("Mobile Class Three Parameterized Constructor Changed in Order......");
		modelNo = mobileModel;
		price = mobilePrice;
		companyName = compName;
	}
	
	//Defining the another Parameterized Constructor
	public Mobile(String mobileModel,String compName) {
		System.out.println("Mobile Class Two Parameterized Constructor......");
	    modelNo = mobileModel;
	    companyName = compName;
	}
	
	//Defining the another Parameterized constructor which accepts Mobile as Parameter
	public Mobile(Mobile mob) {
		System.out.println("Mobile Class Copy Constructor.....");
		modelNo = mob.modelNo;
		price=mob.price;
		companyName=mob.companyName;
	}
	
	//Defining the method for displaying values
	public void displayMobileInfo() {
		System.out.println("Mobile Model No :::::::" + modelNo);
		System.out.println("Mobile Price    :::::::" + price);
		System.out.println("Company Name    :::::::" + companyName);
	}
	
	public static void main(String[] args) {
		
		//Creating Mobile Object with out passing any data
		//It will call Non-Parameterized Constructor and we are not sending any data
		Mobile mob = new Mobile(); 
		
		//calling the displayMobileInfo();
		mob.displayMobileInfo();
		
		System.out.println("****************************************");
		//It will call Parameterized constructor to Intialiaze the values 
	    Mobile mob1 = new Mobile("RealMeU1",25000.00d,"RealME");
	    
	    //calling the displayMobileInfo() using mob1 object
	    mob1.displayMobileInfo();
	    
	    System.out.println("******************************************");
	    //It will call two Parameterized constructor to Initialize the values
	    Mobile mob2 = new Mobile("SAMSUNGM31","Samsung");
	    
	    //calling the displayMobileInfo() using mob2 object
	    mob2.displayMobileInfo();
	    
	    System.out.println("**********************************************");
	    Mobile mob3 = new Mobile("IPHONE7","APPLE",60000.00d);
	    
	    //calling the displayMobileInfo()
	    mob3.displayMobileInfo();
	    
	    System.out.println("************************************************");
	    Mobile mob4 = new Mobile(mob3); //mob3 is an existing object where mob4 is newly created object
	    mob4.displayMobileInfo();
	}
}