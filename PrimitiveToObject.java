
public class PrimitiveToObject {
	
	public static void main(String[] args) {
		
		//primitive value
		int a = 10;
		double d = 25;
		float f = 25.63f;
		System.out.println("Primitive Value of int        ::::" + a);
		System.out.println("Primitive Value of double     ::::" + d);
		System.out.println("Primitive Value of float      ::::" + f);
		
		//Converting the Primitive to Object i.e.,This conversion is deprecated
		Integer i1 = new Integer(a);
		Double  d1 = new Double(d);
		Float   f1 = new Float(f);
		System.out.println("Object Value of int        ::::" + i1);
		System.out.println("Object Value of double     ::::" + d1);
		System.out.println("Object Value of float      ::::" + f1);
		
		System.out.println("*******************************");
		//2 performing Auto Boxing
		Integer i2 = a;
		Double d2 = d;
		Float  f2 =f;
		System.out.println("Object Value of int        ::::" + i2);
		System.out.println("Object Value of double     ::::" + d2);
		System.out.println("Object Value of float      ::::" + f2);
		
		System.out.println("++++++++++++++++++++++++++++++++");
		//3.converting the primitive to Object using static method i.e.,valueOf
		Integer i3 = Integer.valueOf(a);
		Double d3  = Double.valueOf(d);
		Float f3   =  Float.valueOf(f);
		System.out.println("Object Value of int        ::::" + i3);
		System.out.println("Object Value of double     ::::" + d3);
		System.out.println("Object Value of float      ::::" + f3);
	}

}
