package com.xworkz.constance.code;

public class Mango {

	public String shopName;// cons
	public static double price=50;//literal
	public MangoName name=MangoName.BADAMI;
	public boolean sweet;//ref
	public String color;//method
	
	
	public Mango(String shopName)
	{
		this.shopName=shopName;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}

	public void display() {
		System.out.println(this.shopName);
		System.out.println(Mango.price);
		System.out.println(this.name);
		System.out.println(this.sweet);
		System.out.println(this.color);
	}
	
	
	
}
