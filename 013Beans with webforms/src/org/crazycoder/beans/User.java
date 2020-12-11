package org.crazycoder.beans;

public class User {
	private String firstName;
	private String lastName;
	
	public User() {
		super();
		firstName = "silent";
		lastName = "Martin";
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

	
}
