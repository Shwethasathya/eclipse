package com.xworkz.association.thing;

public class City {
	public String cityName;
	public boolean capital;
	public double totalAreaInKm;

	public City(String cityName, boolean capital, double totalAreaInKm) {
		super();
		this.cityName = cityName;
		this.capital = capital;
		this.totalAreaInKm = totalAreaInKm;
	}

	public void display() {
		System.out.println(this.cityName);
		System.out.println(this.capital);
		System.out.println(this.totalAreaInKm);
		if(cityName!=null)
		{
			this.cityName=cityName;
			}
	}
}
