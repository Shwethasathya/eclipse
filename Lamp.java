package com.xworkz.constance.code;

import com.xworkz.constance.cons.Seller;

public class Lamp {

	public int price;
	public String style="Stick";
	public static String brand="philips";
	public Seller seller= Seller.AMAZON;
	public String colors;
	
	public Lamp(int price)
	{
		this.price=price;
	}
	
	public void setColors(String colors)
	{
		this.colors=colors;
	}
	 
	public void display()
	{
	System.out.println(this.price);
	System.out.println(this.style);
	System.out.println(Lamp.brand);
	System.out.println(this.seller);
	System.out.println(this.colors);
	}
}
