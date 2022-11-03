package com.xworkz.encapsulation.thing;

 public class Mobile {

	private String type;
	String model;
	public String brand="mi";
	double price;
	double height;
	double width;
	double weight;
	int noOfCamera;
	String typeOfBattery;
	int noOfColorAvailable;
	String manufacturedPlace;
	char chargerType;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	 void setModel(String model) {
		this.model = model;
	}

	 void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	 void setHeight(double height) {
		this.height = height;
	}

	 void setWidth(double width) {
		this.width = width;
	}

	 void setWeight(double weight) {
		this.weight = weight;
	}

	 void setNoOfCamera(int noOfCamera) {
		this.noOfCamera = noOfCamera;
	}

	 void setTypeOfBattery(String typeOfBattery) {
		this.typeOfBattery = typeOfBattery;
	}

	 void setNoOfColorAvailable(int noOfColorAvailable) {
		this.noOfColorAvailable = noOfColorAvailable;
	}

	 void setManufacturedPlace(String manufacturedPlace) {
		this.manufacturedPlace = manufacturedPlace;
	}

	 void setChargerType(char chargerType) {
		this.chargerType = chargerType;
	}
}
