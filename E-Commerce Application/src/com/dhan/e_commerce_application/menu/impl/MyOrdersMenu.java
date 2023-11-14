package com.dhan.e_commerce_application.menu.impl;

import com.dhan.e_commerce_application.configs.ApplicationContext;
import com.dhan.e_commerce_application.entities.Order;
import com.dhan.e_commerce_application.menu.Menu;
import com.dhan.e_commerce_application.services.OrderManagementService;
import com.dhan.e_commerce_application.services.impl.DefaultOrderManagementService;

public class MyOrdersMenu implements Menu {
	
	private ApplicationContext context = ApplicationContext.getInstance();
	private OrderManagementService orderManagementService = DefaultOrderManagementService.getInstance();

	@Override
	public void start() {
		printMenuHeader();
		if (context.getLoggedInUser() == null) {
			System.out.println(
					"Please, log in or create new account to see list of your orders");
			new MainMenu().start();
			return;
		} else {
			printUserOrdersToConsole();
		}
		
	}
	
	private void printUserOrdersToConsole() {
		Order[] loggedInUserOrders = orderManagementService
				.getOrderByUserId(context.getLoggedInUser().getId());

		if (loggedInUserOrders == null || loggedInUserOrders.length == 0) {
			System.out.println(
					"Unfortunately, you don't have any orders yet. "
					+ "Navigate back to main menu to place a new order");
		} else {
			for (Order order : loggedInUserOrders) {
				System.out.println(order);
			}
		}
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** MY ORDERS *****");
		
	}

}
