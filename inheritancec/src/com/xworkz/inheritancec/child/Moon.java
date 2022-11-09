package com.xworkz.inheritancec.child;

import com.xworkz.inheritancec.thing.Satellite;

public class Moon extends Satellite {

	public String shape;

	public Moon(String satelliteName, String revolveDirection, String shape) {
		super(satelliteName, revolveDirection);
		this.shape = shape;
	}
public void display()
{
	System.out.println("printing details");
	super.display();
	System.out.println(this.shape);
}
}
