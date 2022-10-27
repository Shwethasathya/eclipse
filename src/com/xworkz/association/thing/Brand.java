package com.xworkz.association.thing;

public class Brand {
	public String name;
	public long gstNo;
	public Location location=new Location("rajajinagar", "bangalore", "karnataka", 560040, "india");
public String rating;

	public Brand(String name, long gstNo,String rating) {
		super();
		this.name = name;
		this.gstNo = gstNo;
		this.rating=rating;
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(gstNo);
		System.out.println(rating);
		
		
	}

}
