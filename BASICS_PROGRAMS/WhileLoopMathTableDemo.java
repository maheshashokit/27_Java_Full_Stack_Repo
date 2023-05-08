// Display the 10th Math Table using while loop
class WhileLoopMathTableDemo 
{
	public static void main(String[] args) 
	{
		//Variable required to display Math table
		int tableNo = 10;
	
		//Variable represents for Math Table 10 values
		int currentValue = 1;

		//Loop Iteration
		while(currentValue <= 10){
		
		   System.out.println(tableNo + " * "+ currentValue +" = " + (tableNo * currentValue));

		   //updating counter variable
		   currentValue++;
		}
	}
}