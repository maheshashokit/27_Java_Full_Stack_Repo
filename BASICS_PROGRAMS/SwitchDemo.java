 class SwitchDemo 
 {
	public static void main(String[] args) 
	{
		System.out.println("1. With Draw Amount");
		System.out.println("2. Depoist Amount");
		System.out.println("3. Mini Statement");
		System.out.println("4. Mobile Registration");
		System.out.println("5. Quick Transfer");

		int userChoice = 3; //later we can read this from keyboard dynamically


		//writing the switch statement
		switch(userChoice){
		
             case 1 :  System.out.println("With Draw Business logic Executed!!!!");
			           break;
			 
	    	 case 2 :  System.out.println("Depoist Business logic Executed!!!!");
			           break;
			 
			 case 3 :  System.out.println("Mini Statement Business logic Executed!!!!");
			           break;
			 
			 case 4 :  System.out.println("Mobile Registration Business logic Executed!!!!");
			           break;
			 
			 case 5 :  System.out.println("Quick Transfer Business logic Executed!!!!");
			           break;

			 default : System.out.println("User Choice Not Matched Given Options!!!!");
		  		       break;
		
		}
	}
}