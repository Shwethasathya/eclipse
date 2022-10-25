package com.xworkz.constance.code;

import com.xworkz.constance.cons.ShopName;

public class Sweet {

	public static String brand;
	public int started;
	public ShopName name=ShopName.KANTI_SWEETS;
	public int quantity=35;
	public double price;
	public  String location;
	
	public Sweet(int started) {
		this.started = started;

	}

	public void setPrice(double price) {
		this.price = price;

	}
	static {
		Sweet.brand="kanti";
		
	}
	
	public void display()
	{
		System.out.println(Sweet.brand);
		System.out.println(this.started);
		System.out.println(this.name);
		System.out.println(this.quantity);
		System.out.println(this.price);
		System.out.println(this.location);
		
	}

	

}
