package com.xworkz.encapsulation.thing;

import com.xworkz.encapsulation.type.Type;

public class Sandals {
	private String brand;
	public double price;
	String color;
	String department = "Women";
	Type size = Type.SIX;
	String width = "medium";
	String heelStyle;
	String strapStyle;
	String pattern;
	String material;
	String ortopedicShoeType;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSize(Type size) {
		this.size = size;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public void setHeelStyle(String heelStyle) {
		this.heelStyle = heelStyle;
	}

	public void setStrapStyle(String strapStyle) {
		this.strapStyle = strapStyle;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setOrtopedicShoeType(String ortopedicShoeType) {
		this.ortopedicShoeType = ortopedicShoeType;
	}

}
