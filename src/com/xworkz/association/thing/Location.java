package com.xworkz.association.thing;

public class Location {
	public String street;
	public String city;
	public String state;
	public int pincode;
	public String country;

	public Location(String street, String city, String state, int pincode, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
	}
	
	
	public void display()
	{
		System.out.println(street);
		System.out.println(city);
		System.out.println(state);
		System.out.println(pincode);
		System.out.println(country);
		
	}

}
