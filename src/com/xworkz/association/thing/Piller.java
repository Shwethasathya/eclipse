package com.xworkz.association.thing;

import com.xworkz.association.special.Shape;

public class Piller {

	public int id;
	public String place;
	public Shape shape=Shape.CIRCULAR;
	public float height;
	public String supporting;
	public Company company=new Company("Indus 555", "Steel");

	public Piller(int id, String place, Shape shape, float height, String supporting) {
		super();
		this.id = id;
		this.place = place;
		this.height = height;
		this.supporting = supporting;
	}
	
	public void display()
	{
		System.out.println(id);
		System.out.println(place);
		System.out.println(shape);
		System.out.println(height);
		System.out.println(supporting);
		this.company.display();
		
	}

}
