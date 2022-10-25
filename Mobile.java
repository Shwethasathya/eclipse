package com.xworkz.constance.code;

import com.xworkz.constance.cons.Brand;

public class Mobile {

	public String type;
	public String model;
	public Brand brand=Brand.ONE_PLUS;
	public double price;
	public int noOfCamera;
	public char chargerType;

	public boolean[] colorAvailable;
	public String[] colors;
	public String[] features;
	public String[] serviceCentersAvailabilityPlaces;
	public String[] memoryStorage;
	public String[] simcardType;

	public Mobile(String type, String model, Brand brand, double price, int noOfCamera, char chargerType,
			boolean[] colorAvailable, String[] colors, String[] features, String[] serviceCentersAvailabilityPlaces,
			String[] memoryStorage, String[] simcardType) {
		this.type = type;
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.noOfCamera = noOfCamera;
		this.chargerType = chargerType;
		this.colorAvailable = colorAvailable;
		this.colors = colors;
		this.features = features;
		this.serviceCentersAvailabilityPlaces = serviceCentersAvailabilityPlaces;
		this.memoryStorage = memoryStorage;
		this.simcardType = simcardType;

	}

	public void display() {
		System.out.println(this.type);
		System.out.println(this.model);
		System.out.println(this.price);
		System.out.println(this.brand);
		System.out.println(this.noOfCamera);
		System.out.println(this.chargerType);
		
		for (int i = 0; i < colorAvailable.length; i++) {
			boolean ref = colorAvailable[i];
			System.out.println(ref);
		}
		for (int i = 0; i < colors.length; i++) {
			String ref1 = colors[i];
			System.out.println(ref1);
		}
		for (int i = 0; i < features.length; i++) {
			String ref2 = features[i];
			System.out.println(ref2);
		}
		for (int i = 0; i < serviceCentersAvailabilityPlaces.length; i++) {
			String ref3 = serviceCentersAvailabilityPlaces[i];
			System.out.println(ref3);
		}
		for (int i = 0; i < memoryStorage.length; i++) {
			String b = memoryStorage[i];
			System.out.println(b);

		}
		for (int i = 0; i < simcardType.length; i++) {
			String a = simcardType[i];
			System.out.println(a);
		}
		
	}

}
