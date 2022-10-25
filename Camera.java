package com.xworkz.constance.code;

public class Camera {

	public double price;
	public String brand;
	public boolean usedItem;
	public int resolution;
	public int productRating;

	public String[] sensorTypes;
	public String[] wirelessConnectivity;
	public String[] flashType;
	public String[] seller;
	public String[] brands;
	public String[] type;

	public Camera(double price, String brand, boolean usedItem, int resolution, int productRating, String[] sensorTypes,
			String[] wirelessConnectivity, String[] flashType, String[] seller, String[] brands, String[] type) {
		this.price = price;
		this.brand = brand;
		this.usedItem = usedItem;
		this.resolution = resolution;
		this.productRating = productRating;
		this.sensorTypes = sensorTypes;
		this.wirelessConnectivity = wirelessConnectivity;
		this.flashType = flashType;
		this.seller = seller;
		this.brands = brands;
		this.type = type;
	}

	public void show() {
		System.out.println(this.price);
		System.out.println(this.brand);
		System.out.println(this.usedItem);
		System.out.println(this.resolution);
		System.out.println(this.productRating);

		for (int i = 0; i < sensorTypes.length; i++) {
			String ref = sensorTypes[i];
			System.out.println(ref);
		}
		for (int i = 0; i < wirelessConnectivity.length; i++) {
			String ref1 = wirelessConnectivity[i];
			System.out.println(ref1);

		}
		for (int i = 0; i < flashType.length; i++) {
			String ref2 = flashType[i];
			System.out.println(ref2);
		}
		for (int i = 0; i < seller.length; i++) {
			String ref3 = seller[i];
			System.out.println(ref3);
		}
		for (int i = 0; i < brands.length; i++) {
			String ref4 = brands[i];
			System.out.println(ref4);
		}
		for (int i = 0; i < type.length; i++) {
			String ref5 = type[i];
			System.out.println(ref5);
		}
	}
}
