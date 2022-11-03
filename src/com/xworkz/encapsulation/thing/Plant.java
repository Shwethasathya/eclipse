package com.xworkz.encapsulation.thing;

public class Plant {
	private String plantName;
	public double price;
	boolean flower;
	String species;
	String treeType="Evergreen";
	String seller="Amazon";
	String brand="Root bridge";
	String category="Indoor plant";
	int productRating=4;

	public String getPlantName() {
		return plantName;
	}

	void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	void setPrice(double price) {
		this.price = price;
	}

	void setFlower() {
		this.flower = flower;
	}

	void setSpecies() {
		this.species = species;
	}

	void setTreeType() {
		this.treeType = treeType;
	}

	void setSeller() {
		this.seller = seller;
	}

	void setBrand() {
		this.brand = brand;
	}

	void setCategory() {
		this.category = category;
	}

	void setProductRating() {
		this.productRating = productRating;
	}

	public void display() {
		System.out.println("plant name: " + this.plantName);
		System.out.println("price :" + this.price);
		System.out.println("flower:" + this.flower);
		System.out.println("species:" + this.species);
	}
}