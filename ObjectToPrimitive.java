
public class ObjectToPrimitive {
	
	public static void main(String[] args) {
		
		//Wrapper class object
		Integer i1 = 10;
		Float f1 = 10.2589f;
		Double d1 = 23.6589d;
		
		//1.By calling instance method of respective wrapper classes
		int intValue = i1.intValue();
		float floatValue = f1.floatValue();
	    double doubleValue = d1.doubleValue();
	    System.out.println("int value:::::" + intValue);
	    System.out.println("float value:::::" + floatValue);
	    System.out.println("double value:::::" + doubleValue);
	    
	    System.out.println("*********************************************");
	    
	    //2 Performing Auto UnBoxing
	    int a = i1;
	    float b = f1;
	    double d = d1;
	    System.out.println("int value:::::" + a);
	    System.out.println("float value:::::" + b);
	    System.out.println("double value:::::" + d);
	}

}
