class WhileLoopTablesDemo
{
	public static void main(String[] args) 
	{
		//Below variables represents starting & ending table no.
		int tableStarts = 1;
		int tableEnds = 5;

       //condition for outer while loop
		while(tableStarts <= tableEnds){

			//inner while loop for display 10 values per current table
			int loopStart = 1;
			System.out.println("*****************************************");
			while(loopStart <= 10){
			    System.out.println(tableStarts+ " * " + loopStart + " = " + (tableStarts * loopStart));
				loopStart++;
			}
		   // changing tableStarts value
		   tableStarts++;
		}
	}
}
