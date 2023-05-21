
public class MethodOverloadingClient {

	public static void main(String[] args) {
		
		FilterMethodOverloading fmo = new FilterMethodOverloading();
		
		//calling overloading methods based on different Parameters
		fmo.getProductDetails("SAMSUNG");
		
		fmo.getProductDetails(new String[] {"SAMSUNG","REDMI","NOKIA"});

		fmo.getProductDetails(1000.00f, 15000.05f);
		
		fmo.getProductDetails(25000, 35000);
		
		fmo.getProductDetails(8500.256,9500.58);
		
		//Calling the Static Overloaded Methods
		FilterMethodOverloading.getProductDetails(10000, "SAMSUNG");
		
		FilterMethodOverloading.getProductDetails("APPO", 12500);
		
		MethodOverloadingClient.main("Mahesh");
	}
	
	//overloading the main method
	public static void main(String args) {
		System.out.println("Main Method Got Overloaded......." + args);
	}
}