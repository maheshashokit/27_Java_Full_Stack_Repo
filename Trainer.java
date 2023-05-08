public class Trainer extends Person{
	
	public int trainerId;
	public String domain;
	public float experience;
	
	//Defining the constructors
	public Trainer() {
		System.out.println("Public Constructor for Trainer Class");
	}

	public Trainer(int trainerId, String domain, float experience) {
		System.out.println("Pubic Parameter Constructor from Trainer Class...");
		this.trainerId = trainerId;
		this.domain = domain;
		this.experience = experience;
	}
	
	public void displayTrainerDetails() {
		System.out.println("*********Trainer Information********************");
		System.out.println("TrainerID ::" + trainerId + " Domain ::" + domain + " Experience ::" + experience);
	}
}