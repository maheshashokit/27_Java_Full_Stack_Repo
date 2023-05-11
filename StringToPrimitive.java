
public class StringToPrimitive {
	
	public static void main(String[] args) {

		//Defining the String
		String st  ="1232.232f";
		String st1 = "134";
		String st2 = "c";
		
		//Converting from String into primitive
		float finalFloat = Float.parseFloat("Mahesh");
		int finalInt = Integer.parseInt(st1);
		
		System.out.println("Final Float:::::" + finalFloat);
		System.out.println("Final Int:::::" + finalInt);
      
	}

}
