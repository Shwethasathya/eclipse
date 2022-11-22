package com.xworkz.inheritancec.equals;

public class Vehical {
	private String name;
	private double price;
	private String type;
	private boolean safe;
	private String brand;
	private int noOfWheels;
	private String regNumber;
	private boolean insurance;
	private int capacity;

	public Vehical() {
		System.out.println("calling default constructor");
	}

	public Vehical(String name, double price, String type, boolean safe, String brand, int noOfWheels, String regNumber,
			boolean insurance, int capacity) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		this.safe = safe;
		this.brand = brand;
		this.noOfWheels = noOfWheels;
		this.regNumber = regNumber;
		this.insurance = insurance;
		this.capacity = capacity;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals method in vehical");

		if (obj instanceof Vehical) {
			System.out.println("obj is vehical, can check the properties");
			Vehical casting = (Vehical) obj;
			if (this.name.equals(casting.name)) {
				System.out.println("name is same");
				return true;
			} else {
				System.err.println("obj is not vehical, cannot check the properties");
			}

		}
		return false;
	}

	@Override
	public String toString() {
		return "Vehical [name=" + name + ", price=" + price + ", type=" + type + ", safe=" + safe + ", brand=" + brand
				+ ", noOfWheels=" + noOfWheels + ", regNumber=" + regNumber + ", insurance=" + insurance + ", capacity="
				+ capacity + "]";
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getType() {
		return type;
	}

	public boolean isSafe() {
		return safe;
	}

	public String getBrand() {
		return brand;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public boolean isInsurance() {
		return insurance;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSafe(boolean safe) {
		this.safe = safe;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public void setInsurance(boolean insurance) {
		this.insurance = insurance;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
