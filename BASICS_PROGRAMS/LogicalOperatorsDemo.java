//This program will demonstrates the Logical Operators
class LogicalOperatorsDemo 
{
	public static void main(String[] args) 
	{
		int a  = 30;
		int b  = 50;

		System.out.println("Logical And :::::::" +((b > a) && (a < b)));//true
		System.out.println("Logical Or  :::::::" +((a < b) || (b > a))); //true
		System.out.println("Logical Not :::::::" + !((a == b) && (b==a)));//true
	}
}
