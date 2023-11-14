package com.dhan.e_commerce_application.services;

import com.dhan.e_commerce_application.entities.User;

public interface UserManagementService {
	
	String registerUser(User user);
	User[] getUser();
	User getUserByEmail(String userEmail);

}
