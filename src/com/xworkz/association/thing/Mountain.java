package com.xworkz.association.thing;

public class Mountain {

	public String name;
	public Location location = new Location("dobaspet", "thumkur", "karnataka", 562320, "India");
	public float height;
	public Temple temple = new Temple("shiva", "manunath", 500, 200005);

	public Mountain(String name, float height, String temple) {
		super();
		this.name = name;
		this.height = height;

	}

	public void display() {
		System.out.println(name);
		System.out.println(height);
		
		this.location.display();
		this.temple.display();

	}

}
