package com.dhan.e_commerce_application.entities;

public interface Cart {
	
    boolean isEmpty();
	void addProduct(Product productId);
	Product[] getProduct();
	void clear();
	
}
