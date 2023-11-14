package com.dhan.e_commerce_application.entities.impl;

import com.dhan.e_commerce_application.entities.User;

public class DefaultUser implements User {
	
	private static int userCounter = 0;
	
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private int id = ++userCounter;
	
	public DefaultUser() {
		
	}

	public DefaultUser(String firstName, String lastName, String password, String email) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		
	}



	@Override
	public String getfirstName() {
		// TODO Auto-generated method stub
		return this.firstName;
	}

	@Override
	public String getlastName() {
		// TODO Auto-generated method stub
		return this.lastName;
	}

	@Override
	public String getpassword() {
		// TODO Auto-generated method stub
		return this.password;
	}

	@Override
	public String getemail() {
		// TODO Auto-generated method stub
		return this.email;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
	
	

	@Override
	public String toString() {
		return "First Name = " + this.getfirstName() + ", Last Name =" + this.getlastName() + ", Password =" + this.getpassword() + ", email="
				+ this.getemail() + ", id=" + this.getId() + "]";
	}

	@Override
	public void setPassword(String password) {
		if(password == null) {
			return;
		}
		this.password = password;
		
	}

	@Override
	public void setEmail(String email) {
		if(email == null) {
			return;
		}
		this.email = email;
		
	}
	
	void clearState() {
		userCounter = 0;
	}

}
