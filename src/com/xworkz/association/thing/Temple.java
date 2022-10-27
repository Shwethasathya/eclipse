package com.xworkz.association.thing;

public class Temple {
	public String name;
	public God god=new God("Shiva", 'M', "destroy and re-creat universe");
	public String mainPriest;
	public int noOfVisitor;
	public double collectionPerDay;

	public Temple(String name, String mainPriest, int noOfVisitor, double collectionPerDay) {
		super();
		this.name = name;
		this.mainPriest = mainPriest;
		this.noOfVisitor = noOfVisitor;
		this.collectionPerDay = collectionPerDay;
	}

	public void display()
	{
		System.out.println(name);
		System.out.println(mainPriest);
		System.out.println(noOfVisitor);
		System.out.println(collectionPerDay);
		
	}
}
