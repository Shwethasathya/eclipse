package com.xworkz.inheritance.thing;

public class Marriage {
	public String location;
	public int date;
	public String brideName;

	public Marriage(String location, int date, String brideName) {
		super();
		this.location = location;
		this.date = date;
		this.brideName = brideName;
	}

	public void display() {
		System.out.println(this.location);
		System.out.println(this.date);
		System.out.println(this.brideName);
	}
}
