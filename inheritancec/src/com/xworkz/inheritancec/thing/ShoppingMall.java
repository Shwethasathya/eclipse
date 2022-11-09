package com.xworkz.inheritancec.thing;

import com.xworkz.inheritancec.child.Orion;

public class ShoppingMall {
	public String shopName;
	public long phoneNo;

	public ShoppingMall(String shopName, long phoneNo) {
		super();
		this.shopName = shopName;
		this.phoneNo = phoneNo;
	}

	public void display() {
		System.out.println(this.phoneNo);
		System.out.println(this.shopName);
	}

}
