package com.xworkz.inheritancec.equals;

public class WaterBottle {

	private String brand;
	private String material;
	private double price;
	private float height;
	private float weight;
	private String leakProof;
	private int quantity;
	private boolean sealed;
	private String type;
	private boolean reUse;

	public WaterBottle() {
		// TODO Auto-generated constructor stub
	}

	public WaterBottle(String brand, String material, double price, float height, float weight, String leakProof,
			int quantity, boolean sealed, String type, boolean reUse) {
		super();
		this.brand = brand;
		this.material = material;
		this.price = price;
		this.height = height;
		this.weight = weight;
		this.leakProof = leakProof;
		this.quantity = quantity;
		this.sealed = sealed;
		this.type = type;
		this.reUse = reUse;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals method in water bottle");

		if (obj instanceof WaterBottle) {
			System.out.println("obj is bottle, can check the properties");
			WaterBottle casting = (WaterBottle) obj;
			if (this.brand.equals(casting.brand)) {
				System.out.println("brand is same");
				return true;
			} else {
				System.err.println("obj is not bottle, cannot check the properties");
			}

		}
		return false;
	}

	@Override
	public String toString() {
		return "WaterBottle [brand=" + brand + ", material=" + material + ", price=" + price + ", height=" + height
				+ ", weight=" + weight + ", leakProof=" + leakProof + ", quantity=" + quantity + ", sealed=" + sealed
				+ ", type=" + type + ", reUse=" + reUse + "]";
	}

	public String getBrand() {
		return brand;
	}

	public String getMaterial() {
		return material;
	}

	public double getPrice() {
		return price;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public String getleakProof() {
		return leakProof;
	}

	public int getQuantity() {
		return quantity;
	}

	public boolean isSealed() {
		return sealed;
	}

	public String getType() {
		return type;
	}

	public boolean isReUse() {
		return reUse;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setleakProof(String leakProof) {
		this.leakProof = leakProof;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setSealed(boolean sealed) {
		this.sealed = sealed;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setReUse(boolean reUse) {
		this.reUse = reUse;
	}

}
