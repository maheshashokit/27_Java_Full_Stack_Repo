
public class StringDemoClient {
	
	public static void main(String[] args) {
		
		//1.Defining the string as literal
		String st ="Ashok";
		
		//2.Defining the object as String
		String st1 = new String("Mahesh");
		
		//3.Defining the Character Array for Storing into String object
		char[] ch = {'H','E','L','L','O'};
		String st2 = new String(ch);
		
		//4.Converting the byte array into String
		byte[] b = {97,98,99,100,101,102,103};
		String st3 = new String(b);
		
		System.out.println("st ===" + st);
		System.out.println("st1 ===" + st1);
		System.out.println("st2 ===" + st2);
		System.out.println("st3 ===" + st3);
		
		//we can perform one string operations
		
		
	}

}
