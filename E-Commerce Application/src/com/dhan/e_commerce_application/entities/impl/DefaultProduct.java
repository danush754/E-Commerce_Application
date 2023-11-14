package com.dhan.e_commerce_application.entities.impl;

import com.dhan.e_commerce_application.entities.Product;

public class DefaultProduct implements Product{
	
	private int id;
	private String productName;
	private String categoryName;
	private double price;

	
	public DefaultProduct() {
		
	}
	
	public DefaultProduct(int id, String productName, String categoryName, double price) {
		this.id = id;
		this.productName = productName;
		this.categoryName = categoryName;
		this.price = price;
	}
	
	

	@Override
	public String toString() {
		return "Products -- [ Id = " + id + ", Product Name = " + productName + ", Category Name = " + categoryName
				+ ", Price = " + price + "]";
	}

	@Override
	public int getId() {
		
		return this.id;
	}

	@Override
	public String getProductName() {
		
		return this.productName;
	}

}
