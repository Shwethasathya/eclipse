package com.xworkz.onetomany.thing;

public class Address {
	public Location location=new Location(56, "vijaynagar");
	
public void display()
{
	if(location!=null)
	{
		location.display();	
	}
	
}
}
