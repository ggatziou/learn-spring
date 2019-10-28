package com.meluna.testgit;

public class Customer {
	
	private String firstName;
	private String lastName;
	public Customer(String a_fname, String a_lname)
	{
		firstName = a_fname;
		lastName = a_lname;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return lastName.toUpperCase() + " "+ firstName.toUpperCase();
	}

}
