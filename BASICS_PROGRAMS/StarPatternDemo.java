class StarPatternDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Star Pattern Demo.....");

		//defining the for loop for representing rows
		for(int i = 1; i <= 15 ; i++){ //i =1,2,3,4,5,6
		
			for(int j = 1; j<=i ; j++){ //j=1,2,3,j=1,2,3,4
				
			   System.out.print("* ");		   
			}
			System.out.println();
		}
	}
}