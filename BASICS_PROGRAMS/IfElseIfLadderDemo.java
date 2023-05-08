 class IfElseIfLadderDemo 
 {
	public static void main(String[] args) 
	{
		System.out.println("Start-Program");

        //will show the list of options to end user
		System.out.println("1. With Draw Operation");
		System.out.println("2. Quick Transfer");
		System.out.println("3. Mini Statement");
		System.out.println("4. Balance Enquiry");
		System.out.println("5. Change Password");

		//Declaring the variable for UserChoice required to change everytime to check particular block
		int userChoice = 8;

		if(userChoice == 1){
			System.out.println("User Selected Option is  ::::" + userChoice);
			System.out.println("With Draw Operation!!!!!");
		}else if(userChoice  == 2){
			System.out.println("User Selected Option is  ::::" + userChoice);
			System.out.println("Quick Transfer Operation!!!!!");
		}else if(userChoice  == 3){
			System.out.println("User Selected Option is  ::::" + userChoice);
			System.out.println("Mini Statement Operation!!!!!");
		}else if(userChoice  == 4){
			System.out.println("User Selected Option is  ::::" + userChoice);
			System.out.println("Balance Enquiry Operation!!!!!");
		}else if(userChoice  == 5){
			System.out.println("User Selected Option is  ::::" + userChoice);
			System.out.println("Change Password Operation!!!!!");
		}else{
			System.out.println("Invalid Option!!!!");
		}
		System.out.println("End-Program");
	}
}