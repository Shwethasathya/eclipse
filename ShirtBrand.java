package com.xworkz.constance.code;

import com.xworkz.constance.cons.BrandShirt;
import com.xworkz.constance.cons.Size;

public class ShirtBrand {

	public BrandShirt brand=BrandShirt.BURBERRY;
	public double price;
	public static String colors = "blue";
	public  Size size=Size.M;
	public boolean available;
	
	
	public ShirtBrand(double price)
	{
		this.price=price;
	}
	
	public void setAvailable(boolean available)
	{
		this.available=available;
	}

	public void display() {
		System.out.println(this.brand);
		System.out.println(this.price);
		System.out.println(ShirtBrand.colors);
		System.out.println(this.size);
		System.out.println(this.available);
	}
	
}