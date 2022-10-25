package com.xworkz.constance.code;

import com.xworkz.constance.cons.Types;

public class Cracker {
	
	public static String brand="STANDARD";
	public String shopName;
	public int quantity=2;
	public double price;
	public Types crackerTypes=Types.FLOWER_POT;
	
	
	public Cracker(String shopName)
	{
		this.shopName=shopName;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}

	public void display() {
		System.out.println(Cracker.brand);
		System.out.println(this.shopName);
		System.out.println(this.quantity);
		System.out.println(this.price);
		System.out.println(this.crackerTypes);
		
		
	}
	
	

}
