package com.xworkz.inheritancec.thing;

import com.xworkz.inheritancec.equals.Paint;

public class Hospital {

	private String name;
	private String location;
	private String founder;
	private int noOfDoctors;
	private int noOfPatients;
	private int noOfFloors;
	private int rating;
	private long phoneNumber;
	private int openingHours;
	private String webstite;

	public Hospital() {
		System.out.println("calling default constructor");
	}

	public Hospital(String name, String location, String founder, int noOfDoctors, int noOfPatients, int noOfFloors,
			int rating, long phoneNumber, int openingHours, String webstite) {
		super();
		this.name = name;
		this.location = location;
		this.founder = founder;
		this.noOfDoctors = noOfDoctors;
		this.noOfPatients = noOfPatients;
		this.noOfFloors = noOfFloors;
		this.rating = rating;
		this.phoneNumber = phoneNumber;
		this.openingHours = openingHours;
		this.webstite = webstite;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals method in hospital");

		if (obj instanceof Hospital) {
			System.out.println("obj is hospital, can check the hospital properties");
			Hospital cast = (Hospital) obj;
			if (this.name.equals(cast.name)) {
				System.out.println("name is same");
				return true;
			} else {
				System.err.println("obj is not Hospital, cannot check the properties");
			}

		}
		return false;
	}


	@Override
	public String toString() {
		return "Hospital [name=" + name + ", location=" + location + ", founder=" + founder + ", noOfDoctors="
				+ noOfDoctors + ", noOfPatients=" + noOfPatients + ", noOfFloors=" + noOfFloors + ", rating=" + rating
				+ ", phoneNumber=" + phoneNumber + ", openingHours=" + openingHours + ", webstite=" + webstite + "]";
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public String getFounder() {
		return founder;
	}

	public int getNoOfDoctors() {
		return noOfDoctors;
	}

	public int getNoOfPatients() {
		return noOfPatients;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public int getRating() {
		return rating;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public int getOpeningHours() {
		return openingHours;
	}

	public String getWebstite() {
		return webstite;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public void setNoOfDoctors(int noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}

	public void setNoOfPatients(int noOfPatients) {
		this.noOfPatients = noOfPatients;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setOpeningHours(int openingHours) {
		this.openingHours = openingHours;
	}

	public void setWebstite(String webstite) {
		this.webstite = webstite;
	}

}
