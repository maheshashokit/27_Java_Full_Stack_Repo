//This class created as Enhancement for downloading Employee Form as PDF
public class EmployeeApprasialPDFForm extends EmployeeApprasialForm {

	public String typeOfForm = "Employee Apprasial PDF Form";

	@Override
	public String getEmployeeForm() {
		return "Employee ApprasialForm Generating as PDF.....";
	}

	public String getTypeOfForm() {
		return typeOfForm;
	}
}
