class NestedForLoopDemo 
{
	public static void main(String[] args) 
	{
	     //outer for loop i =1,2,3
		for(int i = 1; i<=5 ;i++){
			
			System.out.println(i +". Welcome To AshokIT Hyderabad.....");
			
			//inner for loop
			for(int j=1; j<=3 ; j++){

				System.out.println(j + ". Welcome To Java Full Stack Development.....");

			}
			System.out.println();
		}
	}
}

/*
Output
======
1. Welcome To AshokIT Hyderabad.....                     >>>>>>>>>>>
1. Welcome To Java Full Stack Development.....           >>>>>>>>>>>
2. Welcome To Java Full Stack Development.....			 >>>>>>>>>>>
3. Welcome To Java Full Stack Development.....	         >>>>>>>>>>>

2. Welcome To AshokIT Hyderabad.....
1. Welcome To Java Full Stack Development.....           >>>>>>>>>>>
2. Welcome To Java Full Stack Development.....           >>>>>>>>>>>
3. Welcome To Java Full Stack Development.....           >>>>>>>>>>>

3. Welcome To AshokIT Hyderabad.....
1. Welcome To Java Full Stack Development.....           >>>>>>>>>>>
2. Welcome To Java Full Stack Development.....           >>>>>>>>>>>
3. Welcome To Java Full Stack Development.....           >>>>>>>>>>>

4. Welcome To AshokIT Hyderabad.....
1. Welcome To Java Full Stack Development.....           >>>>>>>>>>>
2. Welcome To Java Full Stack Development.....           >>>>>>>>>>>
3. Welcome To Java Full Stack Development.....           >>>>>>>>>>>

5. Welcome To AshokIT Hyderabad.....
1. Welcome To Java Full Stack Development.....           >>>>>>>>>>>
2. Welcome To Java Full Stack Development.....           >>>>>>>>>>>
3. Welcome To Java Full Stack Development.....           >>>>>>>>>>> */
