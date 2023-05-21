public class Demo {
	
	public String message ="Ashok IT";

	public Demo() {
		System.out.println("Demo");
	}
	
	public Demo(String message) {
		System.out.println("Demo Class Param Constructor");
		this.message = message;
	}
	
	public void display() {
		System.out.println("Parent Class Display Method:::" + message);
	}
}