package com.xworkz.inheritance.thing;

public class BachelorParty {
	public int noOfPeople;
	public String venue;
	public double price;

	public BachelorParty(String event, String venue, double price) {
		super();
		this.noOfPeople = noOfPeople;
		this.venue = venue;
		this.price = price;
	}

	public void display() {
		System.out.println(this.noOfPeople);
		System.out.println(this.price);
		System.out.println(this.venue);
		
		
	}

}
