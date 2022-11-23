package com.xworkz.inheritancec.equals;

public class Lipstic {

	private String brand;
	private double price;
	private String itemForm;
	private String finishType;
	private int size;
	private String color;
	private int quantity;
	private String manufacturer;
	private String originCountry;
	private float productRating;

	public Lipstic() {
		System.out.println("calling default const..");
	}

	public Lipstic(String brand, double price, String itemForm, String finishType, int size, String color, int quantity,
			String manufacturer, String originCountry, float productRating) {
		super();
		this.brand = brand;
		this.price = price;
		this.itemForm = itemForm;
		this.finishType = finishType;
		this.size = size;
		this.color = color;
		this.quantity = quantity;
		this.manufacturer = manufacturer;
		this.originCountry = originCountry;
		this.productRating = productRating;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals method in god");

		if (obj instanceof Lipstic) {
			System.out.println("obj is lipstic, can check the properties");
			Lipstic casting = (Lipstic) obj;
			if (this.brand.equals(casting.brand)) {
				System.out.println("brand is same");
				return true;
			} else {
				System.err.println("obj is not lipstic, cannot check the properties");
			}

		}
		return false;
	}

	@Override
	public String toString() {
		return "Lipstic [brand=" + brand + ", price=" + price + ", itemForm=" + itemForm + ", finishType=" + finishType
				+ ", size=" + size + ", color=" + color + ", quantity=" + quantity + ", manufacturer=" + manufacturer
				+ ", originCountry=" + originCountry + ", productRating=" + productRating + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getItemForm() {
		return itemForm;
	}

	public void setItemForm(String itemForm) {
		this.itemForm = itemForm;
	}

	public String getFinishType() {
		return finishType;
	}

	public void setFinishType(String finishType) {
		this.finishType = finishType;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

	public float getProductRating() {
		return productRating;
	}

	public void setProductRating(float productRating) {
		this.productRating = productRating;
	}

}
