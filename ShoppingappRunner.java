package com.xworkz.constance.boot;

import com.xworkz.constance.code.ShoppingApp;

public class ShoppingappRunner {

	public static void main(String[] args) {
		
		 String[] type= {"clothing shop","grocery shop"};
		 String[] appsAvailable= {"yes","no"};
		 String[] availableItems= {"dress","saree","electronic items"};
		 String[] appNames= {"flipkart","amazon","big basket"};
		 boolean[] compatible= {true,false};
		 
		 ShoppingApp app = new ShoppingApp("amazon", "jeff bezos", 5, 1994, 15, type, appsAvailable, availableItems, appNames, compatible);
		 
		app.display();
		 
	}

}
