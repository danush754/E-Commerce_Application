package com.dhan.e_commerce_application.entities.impl;

import java.util.Arrays;

import com.dhan.e_commerce_application.entities.Cart;
import com.dhan.e_commerce_application.entities.Product;

public class DefaultCart implements Cart {
	
	private static final int DEFAULT_PRODUCT_LIMIT = 10;
	private Product[] products = new Product[DEFAULT_PRODUCT_LIMIT];
	private int lastIndex;

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(products.length == 0 || products == null) {
			return true;
		}
		for(Product product : products) {
			if(product != null) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		if(products == null) {
			return;
		}
		if(products.length <= lastIndex) {
			products = Arrays.copyOf(products, products.length << 1);
		}
		products[lastIndex++] = product;
	}

	@Override
	public Product[] getProduct() {
		
		int notNullvalues = 0;
		for(Product product :products) {
			if(product != null) {
				notNullvalues++;
			}
		}
		
		int index = 0 ;
		Product[] notNullProduct = new Product[notNullvalues];
		for(Product product: products) {
			if(product != null) {
				notNullProduct[index++] = product;
			}
		}
		return notNullProduct;
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		products = new Product[DEFAULT_PRODUCT_LIMIT];
		
	}

}
