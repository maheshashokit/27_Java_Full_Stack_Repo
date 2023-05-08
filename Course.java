
public class Course {
	
	//Instance Fields
	private int courseId;
	private String courseName;
	
	//Define Constructor
	public Course() {
		System.out.println("Course Class public Constructor with No Parameters....");
	}
	
	//Defining the Parameterized Constructor
	//Constructor Local Field & Instance Field Names are same
	public Course(int courseId,String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	//Defining the method with Parameters
	public void assignValues(int courseId,String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	//Defining the method for display
	public void displayCourseInfo() {
		System.out.println("Course ID    :::::" + courseId);
		System.out.println("Course Name  :::::" + courseName);
	}
	
	public static void main(String[] args) {
		
		//Creating the Object
		Course c = new Course(); //public constructor with no parameter
		
		//calling method
		c.assignValues(12,"CoreJava"); //method call
	    c.displayCourseInfo();	//method call
	    
	    System.out.println("*********************************************");
	    Course c1 = new Course(16,"SpringBoot"); //parameterized constructor get executed
	    c1.displayCourseInfo();
	}
}
