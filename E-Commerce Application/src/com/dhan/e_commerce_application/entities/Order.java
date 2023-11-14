package com.dhan.e_commerce_application.entities;

public interface Order {
	
	public boolean isCreditCardNumberValid(String userInput);
	public void setCreditCardNumber(String userInput);
	public void setProduct(Product[] product);
	public void setCustomerId(int customerId);
	public int getCustomerId(); 
	

}
