class TenaryOperatorDemo 
{
	public static void main(String[] args) 
	{
		int a = 10, b = 30, temp;

		temp  =  a > b ? a : b;

		System.out.println("Temp:::::" + temp); //30

		String temp1 = a < b ? "Ashok IT" :"Mahesh IT";

		System.out.println("Temp1:::::" + temp1);

		temp  =  (a == 10 && b != 30)  ? a + 5 : b - 5;

		System.out.println("Temp:::::" + temp);

		System.out.println("A = " + a);

		System.out.println("B =" + b);
	}
}