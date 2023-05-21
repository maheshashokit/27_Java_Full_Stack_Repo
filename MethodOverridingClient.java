
public class MethodOverridingClient {
	
	public static void main(String[] args) {
		
		//Creating the object for Super class
		EmployeeApprasialForm epf = new EmployeeApprasialForm();
		System.out.println(epf.getEmployeeForm());
		System.out.println(epf.getTypeOfForm());
		
		System.out.println();
		
		//creating the object for sub class
		EmployeeApprasialPDFForm eapf = new EmployeeApprasialPDFForm();
		System.out.println(eapf.getEmployeeForm());
		System.out.println(eapf.getTypeOfForm());
		
		System.out.println();
		
		EmployeeApprasialFillablePdfForm eafp = new EmployeeApprasialFillablePdfForm();
		System.out.println(eafp.getEmployeeForm());
		System.out.println(eafp.getTypeOfForm());
		
		System.out.println();
		
		//creating Parent class reference variable
		EmployeeApprasialForm eapf1 = new EmployeeApprasialPDFForm();//upcasting
		//calling getEmployeeForm method
		System.out.println(eapf1.getEmployeeForm());
		System.out.println(eapf1.getTypeOfForm());
		
		System.out.println();
		
		//overriding the object of eapf1
		eapf1 = new EmployeeApprasialFillablePdfForm();
		System.out.println(eapf1.getEmployeeForm());
		System.out.println(eapf1.getTypeOfForm());
		
		final float INTEREST_RATE = 5.6f;
		//INTEREST_RATE  = INTEREST_RATE + 0.7f;
		System.out.println("Interest Rate Value:::::" + INTEREST_RATE);
	}
}