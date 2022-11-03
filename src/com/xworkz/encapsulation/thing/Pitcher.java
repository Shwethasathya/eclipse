package com.xworkz.encapsulation.thing;

public class Pitcher {

	double price = 15000;
	private String brand = "hp";
	boolean usedItem;
	int resolution = 12;
	int productRating = 4;
	String sensorTypes = "compact";
	String wirelessConnectivity = "wifi";
	String flashType;
	String seller = "nikon1";
	String type;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setUsedItem(boolean usedItem) {
		this.usedItem = usedItem;
	}

	public void setResolution(int resolution) {
		this.resolution = resolution;
	}

	public void setProductRating(int productRating) {
		this.productRating = productRating;
	}

	public void setSensorTypes(String sensorTypes) {
		this.sensorTypes = sensorTypes;
	}

	public void setWirelessConnectivity(String wirelessConnectivity) {
		this.wirelessConnectivity = wirelessConnectivity;
	}

	public void setFlashType(String flashType) {
		this.flashType = flashType;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public void setType(String type) {
		this.type = type;
	}

}
