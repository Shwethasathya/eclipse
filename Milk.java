package com.xworkz.constance.code;

import com.xworkz.constance.cons.Milkproducts;

public class Milk {

	public double price;//
	public int quantity;//
	public static String brand = "Nandini";
	public int expiryMonth;//
	public Milkproducts milkProducts = Milkproducts.RASMALAI;

	public Milk(double price)
	{
		this.price=price;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	
	public void display() {
		System.out.println("Brand : "+Milk.brand);
		System.out.println("Quantity : "+this.quantity);
		System.out.println("Price : "+this.price);
		System.out.println("Expiry : "+this.expiryMonth);
		System.out.println("Products : "+this.milkProducts);
	}
	
	public void totalPrice()
	{
		double totalPrice=quantity*price;
		System.out.println("total price is : " +totalPrice);
	}
	
	
}
