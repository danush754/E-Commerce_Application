package com.dhan.e_commerce_application.services;

import com.dhan.e_commerce_application.entities.Product;

public interface ProductManagementService {
	
	Product[] getProducts();
	Product getProductsById(int productIdToAddToCart);

}
