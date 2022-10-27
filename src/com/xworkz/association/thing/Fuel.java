package com.xworkz.association.thing;

import com.xworkz.association.special.Type;

public class Fuel {

	public Brand brand = new Brand("shell", 52100, "rajajinagar");
	public boolean special;
	public Type type = Type.DIESEL;
	public int price;
	public int quantity;

	public Fuel(boolean special, Type type, int price, int quantity) {
		super();
		this.special = special;
		this.type = type;
		this.price = price;
		this.quantity = quantity;

	}

	public void display() {
		System.out.println(special);
		System.out.println(type);
		System.out.println(price);
		System.out.println(quantity);
		brand.display();
	}

}
