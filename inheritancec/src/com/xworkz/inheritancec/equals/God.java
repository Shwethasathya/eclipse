package com.xworkz.inheritancec.equals;

public class God {

	private String godName;
	private String location;
	private String weapon;
	private String priestName;
	private double distanceFromBangalore;
	private double entryFee;
	private double noOfVisitors;
	private String fullForm;

	public God() {
		System.out.println("default constructor called");
	}

	public God(String godName, String location, String weapon, String priestName, double distanceFromBangalore,
			double entryFee, double noOfVisitors, String fullForm) {
		super();
		this.godName = godName;
		this.location = location;
		this.weapon = weapon;
		this.priestName = priestName;
		this.distanceFromBangalore = distanceFromBangalore;
		this.entryFee = entryFee;
		this.noOfVisitors = noOfVisitors;
		this.fullForm = fullForm;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals method in god");

		if (obj instanceof God) {
			System.out.println("obj is god, can check the properties");
			God casting = (God) obj;
			if (this.godName.equals(casting.godName)) {
				System.out.println("godName is same");
				return true;
			} else {
				System.err.println("obj is not god, cannot check the properties");
			}

		}
		return false;
	}

	@Override
	public String toString() {
		return "God [godName=" + godName + ", location=" + location + ", weapon=" + weapon + ", priestName="
				+ priestName + ", distanceFromBangalore=" + distanceFromBangalore + ", entryFee=" + entryFee
				+ ", noOfVisitors=" + noOfVisitors + ", fullForm=" + fullForm + "]";
	}

	public String getGodName() {
		return godName;
	}

	public void setGodName(String godName) {
		this.godName = godName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getPriestName() {
		return priestName;
	}

	public void setPriestName(String priestName) {
		this.priestName = priestName;
	}

	public double getDistanceFromBangalore() {
		return distanceFromBangalore;
	}

	public void setDistanceFromBangalore(double distanceFromBangalore) {
		this.distanceFromBangalore = distanceFromBangalore;
	}

	public double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(double entryFee) {
		this.entryFee = entryFee;
	}

	public double getNoOfVisitors() {
		return noOfVisitors;
	}

	public void setNoOfVisitors(double noOfVisitors) {
		this.noOfVisitors = noOfVisitors;
	}

	public String getFullForm() {
		return fullForm;
	}

	public void setFullForm(String fullForm) {
		this.fullForm = fullForm;
	}

}
