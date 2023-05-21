public class FilterMethodOverloading {
	
	//Defining the overloaded methods as per our Application Requirement
	public String getProductDetails(String brandName) {
		System.out.println("**** Getting Product Details Based on BrandName*******");
		return "BrandName";
	}
	
	public void getProductDetails(String[] brandName) {
		System.out.println("**** Getting Product Details Based on Multiple BrandNames********");
	}
	
	public void getProductDetails(int minPrice,int maxPrice) {
		System.out.println("**** Getting Product Details Based in Min & Max Price**********");
	}
	
	public void getProductDetails(float minPrice,float maxPrice) {
		System.out.println("**** Getting Product Details Based in Min & Max Price float ******");
	}
	
	public void getProductDetails(double minPrice,double maxPrice) {
		System.out.println("**** Getting Product Details Based in Min & Max Price double ******");
	}
	
	public static void getProductDetails(String brandName,int price) {
		System.out.println("Static Method Overloading.......");
	}
	
	public static void getProductDetails(int price,String brandName) {
		System.out.println("Static Method Overloading-1.......");
	}
}