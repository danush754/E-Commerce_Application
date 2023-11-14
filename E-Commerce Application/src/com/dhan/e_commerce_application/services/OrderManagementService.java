package com.dhan.e_commerce_application.services;

import com.dhan.e_commerce_application.entities.Order;

public interface OrderManagementService {
	
	void addOrder(Order order);
	Order[] getOrderByUserId(int userId);
	Order[] getOrders();
	

}
