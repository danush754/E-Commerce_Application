package com.dhan.e_commerce_application.menu.impl;

import java.util.Scanner;

import com.dhan.e_commerce_application.configs.ApplicationContext;
import com.dhan.e_commerce_application.menu.Menu;
import com.dhan.e_commerce_application.services.UserManagementService;
import com.dhan.e_commerce_application.services.impl.DefaultUserManagementService;
import com.dhan.e_commerce_application.entities.*;
import com.dhan.e_commerce_application.entities.impl.DefaultUser;

public class SignUpMenu implements Menu  {
	
	private UserManagementService userManagementService;
	private ApplicationContext context;

	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
printMenuHeader();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter your first name: ");
		String firstName = sc.next();
		System.out.print("Please, enter your last name: ");
		String lastName = sc.next();
		System.out.print("Please, enter your password: ");
		String password = sc.next();
		System.out.print("Please, enter your email: ");
		
		sc = new Scanner(System.in);
		String email = sc.nextLine();

		User user = new DefaultUser(firstName, lastName, password, email);
		
		String errorMessage = userManagementService.registerUser(user);
		if (errorMessage == null || errorMessage.isEmpty()) {
			context.setLoggedInUser(user);
			System.out.println("New user is created");
		} else {
			System.out.println(errorMessage);
		}
		
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** SIGN UP *****");	
		
	}

}
