package com.xworkz.encapsulation.thing;

public class Printer {

	double price;
	String type;
	private Brand brand = Brand.HP;
	String inkType = "Laser";
	String colorOutPut = "Monochromne";
	String connectivity = "Wi-Fi";
	double printSpeenInPpm = 11 - 20;
	double colorPrintSpeedInPpm = 9 - 16;
	String usedIn = "Office";
	String condition = "New";
	String color = "White";

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setIntType(String inkType) {
		this.inkType = inkType;
	}

	public void setColorOutPut(String colorOutPut) {
		this.colorOutPut = colorOutPut;
	}

	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}

	public void setPrintSpeenInPpm(double printSpeenInPpm) {
		this.printSpeenInPpm = printSpeenInPpm;
	}

	public void setColorPrintSpeedInPpm(double colorPrintSpeedInPpm) {
		this.colorPrintSpeedInPpm = colorPrintSpeedInPpm;
	}

	public void setUsedIn(String usedIn) {
		this.usedIn = usedIn;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
