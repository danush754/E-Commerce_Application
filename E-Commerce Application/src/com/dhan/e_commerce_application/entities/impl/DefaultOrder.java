package com.dhan.e_commerce_application.entities.impl;

import java.util.Arrays;

import com.dhan.e_commerce_application.entities.Order;
import com.dhan.e_commerce_application.entities.Product;

public class DefaultOrder implements Order {
	
	private static final int DIGITS_IN_CREDIT_CARD_NUMBER = 16;
	private String creditCardNumber;
	private Product[] products;
	private int customerId;

	@Override
	public boolean isCreditCardNumberValid(String creditCardNumber) {
		// TODO Auto-generated method stub
		return creditCardNumber.toCharArray().length == DIGITS_IN_CREDIT_CARD_NUMBER && !creditCardNumber.contains(" ") 
		       && Long.parseLong(creditCardNumber) > 0;
		
	}

	@Override
	public void setCreditCardNumber(String creditCardNumber) {
		if(creditCardNumber == null) {
			return;
	}
		this.creditCardNumber = creditCardNumber;
	
		
	}

	@Override
	public void setProduct(Product[] products) {
		this.products = products;
		
	}

	@Override
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
		
	}

	@Override
	public int getCustomerId() {
		
		return this.customerId;
	}

	@Override
	public String toString() {
		return "Order --- Credit Card Number = " + creditCardNumber + ", Products = " + Arrays.toString(products)
				+ ", Customer Id=" + customerId + " ----" ;
	}
	
	

}
