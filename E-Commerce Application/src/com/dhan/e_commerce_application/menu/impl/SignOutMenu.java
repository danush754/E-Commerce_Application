package com.dhan.e_commerce_application.menu.impl;

import com.dhan.e_commerce_application.configs.ApplicationContext;
import com.dhan.e_commerce_application.menu.Menu;

public class SignOutMenu implements Menu {
	
private ApplicationContext context;
	
	{
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		context.setLoggedInUser(null);
		
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** Sign Out *****");
		System.out.println("Have a nice day! Look forward to welcoming back!");	
		
	}

}
