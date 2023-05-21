//This class is used to sent EmployeeForm as Fillable PDF
public class EmployeeApprasialFillablePdfForm extends EmployeeApprasialPDFForm {

	public String typeOfForm = "Employee Apprasial Fillable PDF Form";

	@Override
	public String getEmployeeForm() {
		return "Employee ApprasialForm Generating Fillable PDF Form.....";
	}

	public String getTypeOfForm() {
		return typeOfForm;
	}

}
