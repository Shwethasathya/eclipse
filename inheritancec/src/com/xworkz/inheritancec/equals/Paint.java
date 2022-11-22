package com.xworkz.inheritancec.equals;

public class Paint {

	private String brand;
	private String color;
	private double price;
	private int quantity;
	private boolean quality;
	private String type;
	private String origin;
	private String founder;
	private String manufactured;
	private String foundedInyear;

	public Paint() {

		System.out.println("calling default constructor");
	}

	public Paint(String brand, String color, double price, int quantity, boolean quality, String type, String origin,
			String founder, String manufactured, String foundedInYear) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
		this.quality = quality;
		this.type = type;
		this.origin = origin;
		this.founder = founder;
		this.manufactured = manufactured;
		this.foundedInyear = foundedInYear;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals method in paint");

		if (obj instanceof Paint) {
			System.out.println("obj is paint, can check the paint properties");
			Paint cast = (Paint) obj;
			if (this.brand.equals(cast.brand) && this.color.equals(cast.color)) {
				System.out.println("brand is same");
				return true;
			} else {
				System.err.println("obj is not paint, cannot check the properties");
			}

		}
		return false;
	}

	@Override
	public String toString() {
		return "Paint [brand=" + brand + ", color=" + color + ", price=" + price + ", quantity=" + quantity
				+ ", quality=" + quality + ", type=" + type + ", origin=" + origin + ", founder=" + founder
				+ ", manufactured=" + manufactured + ", foundedInyear=" + foundedInyear + "]";
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public boolean isQuality() {
		return quality;
	}

	public String getType() {
		return type;
	}

	public String getOrigin() {
		return origin;
	}

	public String getFounder() {
		return founder;
	}

	public String getManufactured() {
		return manufactured;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public void setManufactured(String manufactured) {
		this.manufactured = manufactured;
	}

	public void setFoundedInyear(String FoundedInyear) {
		this.foundedInyear = foundedInyear;

	}

}
