public class ObjectToString {

	public static void main(String[] args) {
		// Boxing
		Double d = 23.598d;
		Short sh = 258;
		// Converting wrapper object into string format
		System.out.println("D  ====" + d.toString());
		System.out.println("sh ====" + sh.toString());
		// converting wrapper object into string object using concation operator(+)
		String st = "" + d;
		String st1 = "" + sh;
		System.out.println("st =========" + st);
		System.out.println("st1 =========" + st1);
	}
}