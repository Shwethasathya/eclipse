package com.xworkz.constance.code;

public class Saloon {
	
	public String name;
	public static String location;
	public double price;
	public long phoneNo=8511944032L;
	
	public Saloon(String name)
	{
		this.name=name;
}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	static {
		
		location="rajajinagar";
	}
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(Saloon.location);
		System.out.println(this.price);
		System.out.println(this.phoneNo);
	}
}
	
	
	
	
