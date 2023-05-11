
public class StringToObject {
	
	public static void main(String[] args) {
		
		//In Java We can Store numbers as String format i.e.,enclosed with ""
		String no = "145";
		String floatNo = "123.456f";
		String doubleNo = "123.34556d";
		
		//1.Passing numbers as string to Wrapper Class Constructor
		Integer i1 = new Integer(no);
		Float   f1 = new Float(floatNo);
		Double  d1 = new Double(doubleNo);
		
		System.out.println("Object i1 :::::" + i1);
		System.out.println("Object f1 :::::" + f1);
		System.out.println("Object d1 :::::" + d1);
		
		
		//2.Converting the numbers as String using static method of Wrapper class
		Integer intValue = Integer.valueOf(no);
		Float floatValue = Float.valueOf(floatNo);
		Double doubleValue = Double.valueOf(doubleNo);
		System.out.println("Object intValue :::::" + intValue);
		System.out.println("Object floatValue :::::" + floatValue);
		System.out.println("Object doubleValue :::::" + doubleValue);
		
		
		
		
	}

}
