package com.dhan.e_commerce_application;

import com.dhan.e_commerce_application.menu.Menu;
import com.dhan.e_commerce_application.menu.impl.MainMenu;

public class Main {
	
	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {
		
		Menu mainMenu = new MainMenu();
		mainMenu.start();
		
	}

}
