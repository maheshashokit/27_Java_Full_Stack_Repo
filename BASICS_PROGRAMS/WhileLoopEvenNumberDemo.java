//Displaying even number between 1 to 20
class WhileLoopEvenNumberDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Finding Even Numbers From 1 to 20");

		int currentNumber = 1;

		while(currentNumber <= 20){
		
			//checking the currentNumber is even or not
			if ( currentNumber % 2  == 0){
               System.out.println("Even Number is :::::" + currentNumber);
			}

			//updating the currentNumber value
			currentNumber++;
		}
	}
}