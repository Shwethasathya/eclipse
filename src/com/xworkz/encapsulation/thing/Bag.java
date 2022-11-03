package com.xworkz.encapsulation.thing;

public class Bag {

	public String color;
	String pattern="floral";
	double price=680;
	String style= "Shoulder Bag";
	String category="Tote handbag";
	String brand="Stybuzz";
	int noOfCompartments=2;
	String material;
	String seller;
	boolean waterProof=true;
	boolean wheelsAvailable=false;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setNoOfCompartments(int noOfCompartments) {
		this.noOfCompartments = noOfCompartments;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public void setWaterProof(boolean waterProof) {
		this.waterProof = waterProof;
	}

	public void setWheelsAvailable(boolean wheelsAvailable) {
		this.wheelsAvailable = wheelsAvailable;
	}

}
