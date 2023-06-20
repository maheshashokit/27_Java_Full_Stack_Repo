package com.ashokit.exceptionhandling;

public class User {

	private String userId;

	private String firstName;

	private String lastName;

	public User() {
		System.out.println("User Class Constructor.....");
	}

	public User(String userId, String firstName, String lastName) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	// Defining the business method for returning bulk of users
	public User[] getAllUsersInfo() {

		User user1 = new User("AIT123", "Mahesh", "Kumar");
		User user2 = new User("AIT356", "Ashok", "Kumar");

		return new User[] { user1, user2 };
	}
}