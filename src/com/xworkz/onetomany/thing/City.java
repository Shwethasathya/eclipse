package com.xworkz.onetomany.thing;

public class City {

	public String cityName = "Bangalore";
	public String founder;
	public double areaCovered;
	public double population;

	public City(double areaCovered, double population) {
		super();
		this.areaCovered = areaCovered;
		this.population = population;
	}

	public void setFounder(String founder) {
		this.founder = founder;

	}

	public void display() {
		System.out.println("          ");
		System.out.println(this.cityName);
		System.out.println(this.founder);
		System.out.println(this.areaCovered);
		System.out.println(this.population);
	}
}
