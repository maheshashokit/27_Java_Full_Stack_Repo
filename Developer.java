
public class Developer extends Person {
	
	public String domain;
	public float experience;
	public double salary;
	
	public Developer() {
		System.out.println("Developer Class public Constructor....");
    }

	public Developer(String domain, float experience, double salary) {
		super();
		this.domain = domain;
		this.experience = experience;
		this.salary = salary;
	}
	
	public void displayDeveloperInformation() {
		System.out.println("*********Developer Information********************");
		System.out.println("Domain ::" + domain + " Experience ::" + experience + " salary ::" + salary);
	}
}