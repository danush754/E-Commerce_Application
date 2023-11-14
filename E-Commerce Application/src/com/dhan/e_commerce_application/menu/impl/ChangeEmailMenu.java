package com.dhan.e_commerce_application.menu.impl;

import java.util.Scanner;

import com.dhan.e_commerce_application.configs.ApplicationContext;
import com.dhan.e_commerce_application.menu.Menu;

public class ChangeEmailMenu implements Menu {
	
		private ApplicationContext context = ApplicationContext.getInstance();

	@Override
	public void start() {
		printMenuHeader();
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		context.getLoggedInUser().setEmail(userInput);
		System.out.println("Your email has been updated ");
		
	}

	@Override
	public void printMenuHeader() {
		System.out.println("****Change Email*****");
		System.out.print("Enter new Email: ");
		
	}
	

}
