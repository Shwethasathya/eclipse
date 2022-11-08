package com.xworkz.inheritance.thing;

import com.xworkz.inheritance.child.Menu;

public class Catering {
	public String serviceType;
	public double price;
	public Menu menu;

	public Catering(String serviceType, double price, Menu menu) {
		super();
		this.serviceType = serviceType;
		this.price = price;
		this.menu = menu;
	}

	public void display() {
		System.out.println(this.price);
		System.out.println(this.serviceType);
		System.out.println(this.menu);

	}

}
