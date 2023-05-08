class DoWhileDemo 
{
	public static void main(String[] args) 
	{
		int loopStart = 1;

		int loopStart1 = 10;

		do{
          System.out.println("Loop Start =" +loopStart);

		  loopStart = loopStart + 1 ;			  
		
		}while(loopStart <=10);

		System.out.println("*************************************************");

		do{
		  System.out.println("Second Loop Start :::" + loopStart1);

		  loopStart1 = loopStart1 - 1;
		
		} while( loopStart1 != 0);
	}
}
