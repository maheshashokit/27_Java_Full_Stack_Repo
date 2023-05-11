public class PrimitiveToString {
	
	public static void main(String[] args) {
		
		//primitive
		int a  = 10;
		double db =1234.4545d;
		
		//Converting the primitive into string
		String st = Integer.toString(a);
		String st1 = Double.toString(db);
		
		System.out.println("st ==" + st);
		System.out.println("st1 ==" + st1);
		
		//converting the prmitive into String using + operator
		String st2 = ""+a;
		String st3 = ""+db;
		System.out.println("st2===" + st2);
		System.out.println("st3===" + st3);
	}
}