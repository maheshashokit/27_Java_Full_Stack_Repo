//Defining the Student Class
public class Student {
	
	//Declaring the Fields For Student
	int id; //0
	String name; //null
	String branch;//null
	int subject1;//0
	int subject2;//0
	int subject3;//0
	String gender;//null 
		
	//Declaring the Method for assigning values to Fields
	public void assignValues(int studentId,String studentName,String studentBranch,
			          int firstSubjectMarks,int secondSubjectMarks,int thirdSubjectMarks,
			          String studentGender) {
		//Assigning the values
		id = studentId;
		name = studentName;
		branch = studentBranch;
		subject1 = firstSubjectMarks;
		subject2 = secondSubjectMarks;
		subject3 = thirdSubjectMarks;
		gender = studentGender;
	}	
		
	//Declaring the Method for displaying values
	void displayStudentDetails() {
		//Define logic
		System.out.println("Student ID      ::::::" + id);
		System.out.println("Student Name    ::::::" + name);
		System.out.println("Student Branch  ::::::" + branch);
		System.out.println("Student Gender  ::::::" + gender);
		System.out.println("Subject-1 Marks ::::::" + subject1);
		System.out.println("Subject-2 Marks ::::::" + subject2);
		System.out.println("Subject-3 Marks ::::::" + subject3);
		System.out.println("Total Marks     ::::::" + getTotalMarks()); //Nested Method Calling
		System.out.println("Average Marks   ::::::" + getAverageMarks());//Nested Method Calling
		System.out.println("Student Result  ::::::" + getStudentResult());//Nested Method Calling
	}
	
	//Declaring the Method for calculating totalMarks of an Student
	int getTotalMarks() {		
		return (subject1 + subject2 + subject3);
	}
	
	//Declaring the Method for calculating averageMarks of an Student
	double getAverageMarks() {
		//We need to find the total Marks by calling getTotalMarks();
		int totalMarks = getTotalMarks();
		double avgMarks = totalMarks / 3;
		return avgMarks;
	}
	
	//Declaring the Method for evaluating Student Result
	String getStudentResult() {		
		// First we need to get Average Marks of an Student
	    double averageMarks = getAverageMarks();	    
	    //Implement the Business Conditions
	    if(averageMarks > 75) {
	    	return "Congrats Student Passed In First Class....";
	    }else if(averageMarks > 60 && averageMarks <=75) {
	    	return "Congrats Student Passed in Second Class...";
	    }else {
	    	return "Congrats Student Passed in Third Class...";
	    }
	}
	
	//Defining the main method for executing the Java Program
	public static void main(String[] args) {
		
		//Creating the object for Student Class
		Student stObj = new Student();		
		//Calling method for Assigning the values
		//stObj.assignValues(25, "Mahesh", "CSE",65,25,45,"MALE");		
		//Calling Method for displaying values 
		stObj.displayStudentDetails();
		
		System.out.println("*******************************************************");

		//Creating the another object for student class
		Student stObj1 = new Student();		
		//Calling Method for Assigning the Values
		stObj1.assignValues(35, "Ashok", "IT",65,75,88,"MALE");		
		//Calling Method for displaying Values
		stObj1.displayStudentDetails();	
	}
}