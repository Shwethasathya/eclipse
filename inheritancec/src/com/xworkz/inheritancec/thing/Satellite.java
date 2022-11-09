package com.xworkz.inheritancec.thing;

public class Satellite {
	public String satelliteName;
	public String revolveDirection;

	public Satellite(String satelliteName, String revolveDirection) {
		super();
		this.satelliteName = satelliteName;
		this.revolveDirection = revolveDirection;
	}

	public void display() {
		System.out.println(this.revolveDirection);
		System.out.println(this.satelliteName);
	}
}
