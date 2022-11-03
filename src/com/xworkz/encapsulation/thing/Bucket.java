package com.xworkz.encapsulation.thing;

public class Bucket {

	String seller="flipcart";
	String brand;
	String color;
	String material;
	double weight;
	double capacityInLiters=15;
	double price=250;
	String pattern="Floral";
	String handleMaterial="Steel";
	boolean withLid;
	String origin="India";

	public String getColor() {
		return color;
	}

	public String getMaterial() {
		return material;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setCapacityInLiters(double capacityInLiters) {
		this.capacityInLiters = capacityInLiters;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public void setHandleMaterial(String handleMaterial) {
		this.handleMaterial = handleMaterial;
	}

	public void setWithLid(boolean withLid) {
		this.withLid = withLid;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	

}
