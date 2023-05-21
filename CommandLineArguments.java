
public class CommandLineArguments {
	
	 public static void main(String[] args) {
		 System.out.println("Command Line Argument Parameters.....");
		 //Defining 1.5 foreach loop for iterating String[]
		 for(String temp : args) {
			 System.out.println("Test:::" + temp);
		 }
		 
		 int a = Integer.parseInt(args[0]);
		 int b = Integer.parseInt(args[1]);
		 System.out.println("Addition Of Two Numbers::::" + (a+b));
	}
}