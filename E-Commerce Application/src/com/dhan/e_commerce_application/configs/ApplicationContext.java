package com.dhan.e_commerce_application.configs;

import com.dhan.e_commerce_application.entities.Cart;
import com.dhan.e_commerce_application.entities.User;
import com.dhan.e_commerce_application.entities.impl.DefaultCart;
import com.dhan.e_commerce_application.menu.Menu;

public class ApplicationContext {
	
	private static ApplicationContext instance;
	
	private User loggedInUser;
    private Menu mainMenu;
    private Cart sessionCart;
    
    private ApplicationContext() {
    	
    }

	

	public User getLoggedInUser() {
		return loggedInUser;
	}

	public void setLoggedInUser(User loggedInUser) {
		if(this.sessionCart != null) {
			this.sessionCart.clear();
		}
		this.loggedInUser = loggedInUser;
	}

	public Menu getMainMenu() {
		return mainMenu;
	}

	public void setMainMenu(Menu mainMenu) {
		this.mainMenu = mainMenu;
	}

	
	public static ApplicationContext getInstance() {
		if(instance == null) {
			instance = new ApplicationContext();
		}
		return instance;
	}
	
	public Cart getSessionCart() {
		if(this.sessionCart == null) {
			this.sessionCart = new DefaultCart();
		}
		return this.sessionCart;
	}

	
    
    
	

}
