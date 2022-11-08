package com.xworkz.inheritance.thing;

import com.xworkz.inheritance.child.Type;

public class Invitation {
	public Type type = Type.ENGAGEMENT;
	public int noOfCopies;
	public String color;

	public Invitation(Type type, int noOfCopies, String color) {
		super();
		this.type = type;
		this.noOfCopies = noOfCopies;
		this.color = color;
	}

	public void display() {
		System.out.println(this.color);
		System.out.println(this.noOfCopies);
		System.out.println(this.type);
	}

}
