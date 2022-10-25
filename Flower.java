package com.xworkz.constance.code;

import com.xworkz.constance.cons.Flowername;

public class Flower {

	public static String flowerShopName;
	public Flowername flowerName=Flowername.JASMINE;
	public double price;
	public String location="market";
	public int quantity;
	
	public Flower(int quantity)
	{
		this.quantity=quantity;
		
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	static {
		flowerShopName="lakshmi floral shop";
		
	}
	
	public void display()
	{
		System.out.println("flower shop name :" +Flower.flowerShopName);
		System.out.println("flower name : "+this.flowerName);
		System.out.println("flower price ; "+this.price);
		System.out.println("shop location is : "+this.location);
		System.out.println("quantity of flower :"+this.quantity);
	}
}
