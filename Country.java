package com.xworkz.association.thing;

public class Country {
	public String countryName;
	public President president;
	public City[] cities;

	public Country(String countryName) {
		super();
		this.countryName = countryName;
		
	}

	public  void setCities(City[] cities) {
	this.cities = cities;

	}
public void display()
{
	System.out.println(this.countryName);
	
	
}
	

}

