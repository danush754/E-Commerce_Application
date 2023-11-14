package com.dhan.e_commerce_application.menu.impl;

import com.dhan.e_commerce_application.configs.ApplicationContext;
import com.dhan.e_commerce_application.entities.User;
import com.dhan.e_commerce_application.menu.Menu;
import com.dhan.e_commerce_application.services.UserManagementService;
import com.dhan.e_commerce_application.services.impl.DefaultUserManagementService;

public class CustomerListMenu implements Menu{
	
	private ApplicationContext context = ApplicationContext.getInstance();
	private UserManagementService userManagementService =  DefaultUserManagementService.getInstance();

	@Override
	public void start() {
		printMenuHeader();
		User[] users = userManagementService.getUser();
		
		if (users.length == 0) {
			System.out.println("Unfortunately, there are no customers.");
		} else {
			for (User user : users) {
				System.out.println(user);
			}
		}
		
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** USERS *****");		
		
	}

}
