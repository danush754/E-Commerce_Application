package com.dhan.e_commerce_application.menu.impl;

import java.util.Scanner;

import com.dhan.e_commerce_application.configs.ApplicationContext;
import com.dhan.e_commerce_application.entities.User;
import com.dhan.e_commerce_application.menu.Menu;
import com.dhan.e_commerce_application.services.UserManagementService;
import com.dhan.e_commerce_application.services.impl.DefaultUserManagementService;

public class SignInMenu implements Menu {
	
	private ApplicationContext context;
	private UserManagementService userManagementService;

	{
		context = ApplicationContext.getInstance();
		userManagementService = DefaultUserManagementService.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		Scanner sc = new Scanner(System.in);

		System.out.print("Please, enter your email: ");
		String userEmail = sc.next();

		System.out.print("Please, enter your password: ");
		String userPassword = sc.next();

		User user = userManagementService.getUserByEmail(userEmail);
		if (user != null && user.getpassword().equals(userPassword)) {
			System.out.printf("Glad to see you back %s %s", user.getfirstName(),
					user.getlastName() + System.lineSeparator());
			context.setLoggedInUser(user);
		} else {
			System.out.println("Unfortunately, such login and password doesn't exist");
		}
		
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** Sign In *****");
		
	}

}
