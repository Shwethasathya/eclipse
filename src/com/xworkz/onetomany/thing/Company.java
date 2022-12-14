package com.xworkz.onetomany.thing;

public class Company {
	public String name;
	public String ownerName;
	public Address address = new Address();

	public Company(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	public void display() {
		System.out.println("displaying company details........");
		if (address != null) {
			address.display();
		}
		System.out.println(this.name);
		System.out.println(this.ownerName);
		System.out.println(System.lineSeparator());
	}
}