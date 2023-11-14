package com.dhan.e_commerce_application.menu.impl;

import java.util.Scanner;

import com.dhan.e_commerce_application.configs.ApplicationContext;
import com.dhan.e_commerce_application.menu.Menu;

public class ChangePasswordMenu implements Menu {
	
	private ApplicationContext context;

	@Override
	public void start() {
		printMenuHeader();
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		context.getLoggedInUser().setPassword(userInput);
		System.out.println("Your password has been updated");
		
	}

	@Override
	public void printMenuHeader() {
		System.out.println("****Change Password****");
		System.out.print("Enter the new password: ");
		
	}

}
