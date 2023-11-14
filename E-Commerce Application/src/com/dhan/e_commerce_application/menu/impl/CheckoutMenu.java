package com.dhan.e_commerce_application.menu.impl;

import java.util.Scanner;

import com.dhan.e_commerce_application.configs.ApplicationContext;
import com.dhan.e_commerce_application.menu.Menu;
import com.dhan.e_commerce_application.services.OrderManagementService;
import com.dhan.e_commerce_application.services.impl.DefaultOrderManagementService;
import com.dhan.e_commerce_application.entities.Order;
import com.dhan.e_commerce_application.entities.impl.DefaultOrder;

public class CheckoutMenu implements Menu{
	
	private ApplicationContext context = ApplicationContext.getInstance();
	private OrderManagementService orderManagementService = DefaultOrderManagementService.getInstance();		
	

	@Override
	public void start() {
		while (true) {
			printMenuHeader();
			Scanner sc = new Scanner(System.in);
			String userInput = sc.next();

			if (!createOrder(userInput)) {
				continue;
			}
			context.getSessionCart().clear();
			break;
		}
		
		System.out.println("Thanks a lot for your purchase. Details about order delivery are sent to your email.");
		
	}
	
	private boolean createOrder(String creditCardNumber) {
		Order order = new DefaultOrder();
		if (!order.isCreditCardNumberValid(creditCardNumber)) {
			return false;
		}
		
		order.setCreditCardNumber(creditCardNumber);
		order.setProduct(context.getSessionCart().getProduct());
		order.setCustomerId(context.getLoggedInUser().getId());
		orderManagementService.addOrder(order);
		return true;
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** CHECKOUT *****");
		System.out.print(
				"Enter your credit card number without spaces and press enter if you confirm purchase: ");
	}

}
