package com.dhan.e_commerce_application.entities;

public interface User {
	
	public String getfirstName();
	public String getlastName();
	public String getpassword();
	public String getemail();
	public int getId();
	public void setPassword(String newPassword);
	public void setEmail(String newEmail);
	
}
