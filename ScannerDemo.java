import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter any Integer Value...");
		int a = sc.nextInt();
		System.out.println("Enter any Integer value...");
		int b = sc.nextInt();
		System.out.println("Result of The operation::::"+(a+b));
		
		System.out.println("Enter Any Name");
		String username =sc.next();
		sc.nextLine();
		System.out.println("Enter Float Value");
		float c = sc.nextFloat();
		System.out.println("Enter Any Character");
		String ch = sc.next();
		System.out.println("Username ::::" + username);
		System.out.println("Float value:::::" +c);
		System.out.println("Character ::::"+ch);
		sc.close();
	}
}