package com.xworkz.encapsulation.thing;

public class Chakra {

	public String name="Ceat";
	public Tyres tyre=new Tyres("mnm", 90, 5, 10, 100, 25, 65, 100);
	
	
	public void display()
	{
		
		System.out.println(tyre.maximumLoad);
		System.out.println(tyre.productRating);
		System.out.println(tyre.rimZizeInInches);
		System.out.println(tyre.sectionWidthInMm);
		System.out.println(tyre.size);
		System.out.println(tyre.type);
		System.out.println(tyre.TypeAspectRatio);
		//System.out.println(tyre.typeUsedFor);
		System.out.println(tyre.warranty);
		
	}
}
