
//This class used for demonstrating the second purpose of this keyword
public class Employee {
	
	private String empName;
	private float salary;
	public static String companyName="Ashok IT";
	
	//public constructor
	public Employee() {
		System.out.println("Employee Class public Constructor......");
	}
	
	//public Constructor with Single Parameterized
	public Employee(String empName) {
		//calling to public constructor
		this();
		System.out.println("Employee Class public constructor with single Parameterized");
		this.empName = empName;
	}
	
	//public constructor with two Parameterized Constructor
	public Employee(String empName,float salary) {
		//calling single parameterized constructor
		this(empName);
		System.out.println("Employee Class public constructor with two parameterized");
		this.salary = salary;
	}
	
	//business method for display employee fields
	public void displayEmployeeDetails() {
		System.out.println("Employee Name   ::::" + empName);
		System.out.println("Employee Salary ::::" + salary);
		System.out.println("Company Name    ::::" + companyName);
		displayCompanyName();
	}
	
	//Defining the Static Method
	public static void displayCompanyName() {
		System.out.println("Static Method Company Name:::::"+companyName);
		//System.out.println("Static Method Employee Name::::::" + empName);
	} 
	
	//Defining the method which is return type of Employee
	public Employee getEmployeeObject() {
		return this;
	}
	
	public static void main(String[] args) {
		
		//Creating the object for Employee class
		Employee emp = new Employee("Mahesh",25000.0f); //calling two parameterized constructor
		
		//calling the business method for displaying the values
		//emp.displayEmployeeDetails();
		emp.getEmployeeObject().displayEmployeeDetails();
		System.out.println("Company Name::::" + Employee.companyName);
		
		System.out.println("******************************************************");
		//Creating another object for Employee Class
		Employee emp2 = new Employee("Ashok",35000.0f);
		emp2.getEmployeeObject().displayEmployeeDetails();
		System.out.println("Company Name::::" + Employee.companyName);
	}
}