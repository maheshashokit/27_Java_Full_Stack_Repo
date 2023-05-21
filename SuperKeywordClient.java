
public class SuperKeywordClient {
	
	public static void main(String[] args) {
		
	    Test t = new Test();
	    //t.displayMessage();
	    t.display();
	    
	    //Creating Test Class object with Data
	    //Test t1 = new Test("Welcome To Hyderabad");
	   // t1.displayMessage();
	    System.out.println(t.hashCode()); //number value
	    System.out.println(t.toString());
	    System.out.println(Integer.toHexString(t.hashCode()));
	}
	
	
	public void testDisplay() {
		
	}
}