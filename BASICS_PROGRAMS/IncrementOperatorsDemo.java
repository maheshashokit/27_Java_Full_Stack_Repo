class IncrementOperatorsDemo 
{
	public static void main(String[] args) 
	{
		int a = 20;
		System.out.println("Pre Increment  :::::" + (++a));//21
		System.out.println("Pre Increment  :::::" + (++a));//22
		System.out.println("Pre Increment  :::::" + (++a));//23

		System.out.println("Post Increment  :::::" + (a++));//23  >>> 24
		System.out.println("Post Increment  :::::" + (a++));//24  >>> 25
		System.out.println("Post Increment  :::::" + (a++));//25  >>> 26
 
        System.out.println("A ====" + a);//26

		System.out.println("Sample Expression::::" + (a++ + ++a));//54		

		System.out.println("A =" + a);//28
		
		System.out.println("Sample Expression :::::" + (++a+a++ + ++a));//89

	}
}
