package com.xworkz.inheritance.thing;

public class preWeddingShoot {
	public String location;
	public String theme;

	public preWeddingShoot(String location, String theme) {
		super();
		this.location = location;
		this.theme = theme;
	}

	public void display() {
		System.out.println(this.location);
		System.out.println(this.theme);

	}

}
