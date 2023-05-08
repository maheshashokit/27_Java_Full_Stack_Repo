//This program will demonstrates the Bitwise operatorsz
class BitWiseOperatorsDemo 
{
	public static void main(String[] args) 
	{
		int a = 10 , b = 25;

		System.out.println("Bitwise AND        ::::::" + (a & b));
		System.out.println("Bitwise OR         ::::::" + (a | b));
		System.out.println("Bitwise XOR        ::::::" + (a ^ b));
		System.out.println("Bitwose Complement ::::::" + (~a));
		System.out.println("Bitwise Right Shift::::::" + (a >> 2));//2
		System.out.println("Bitwise Right Shift::::::" + (a >> 3));//1
		System.out.println("Bitwise left shift ::::::" + (a << 2));

	}
}
