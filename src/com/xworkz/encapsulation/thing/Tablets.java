package com.xworkz.encapsulation.thing;

public class Tablets {

	private String name="crocin";
	String type="tablet";
	double price;
	int size=4;
	String shape="Round";
	String width="medium";
	String brand="Bionorica";
	String seller="med plus";
	String color="white";
	private String usedFor;

	public String getName() {
		return name;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}
