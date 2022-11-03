package com.xworkz.encapsulation.thing;

public class Tyres {
	private String brand;
	private String color = "Black";
	private String typeUsedFor = "Cars";
	String type;
	int size = 90;
	int productRating = 5;
	double rimZizeInInches = 10;
	double TypeAspectRatio = 100;
	double sectionWidthInMm = 90;
	int warranty = 4;
	double maximumLoad = 1060;

	public Tyres(String type, int size, int productRating, double rimZizeInInches, double typeAspectRatio,
			double sectionWidthInMm, int warranty, double maximumLoad) {
		super();
		this.type = type;
		this.size = size;
		this.productRating = productRating;
		this.rimZizeInInches = rimZizeInInches;
		TypeAspectRatio = typeAspectRatio;
		this.sectionWidthInMm = sectionWidthInMm;
		this.warranty = warranty;
		this.maximumLoad = maximumLoad;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public String getTypeUsedFor() {
		return typeUsedFor;
	}

	public void setTypeUsedFor(String typeUsedFor) {
		this.typeUsedFor = typeUsedFor;
	}

	
}
