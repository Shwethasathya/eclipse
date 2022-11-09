package com.xworkz.inheritancec.child;

import com.xworkz.inheritancec.thing.ShoppingMall;

public class Orion extends ShoppingMall {
	public String location;

	public Orion(String shopName, long phoneNo) {
		super(shopName, phoneNo);

	}

	public Orion(String shopName, long phoneNo, String location) {
		super(shopName, phoneNo);
		this.location = location;
	}

	public void display()
	{
		System.out.println(this.location);
		super.display();
	}
}
