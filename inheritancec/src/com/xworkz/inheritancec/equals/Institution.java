package com.xworkz.inheritancec.equals;

public class Institution {

	private String name;
	private String location;
	private String type;
	private double fee;
	private int noOfStaffs;
	private String principalName;
	private int noOfStudents;
	private int noOfBranches;

	public Institution() {

	}

	public Institution(String name, String location, String type, double fee, int noOfStaffs, String principalName,
			int noOfStudents, int noOfBranches) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
		this.fee = fee;
		this.noOfStaffs = noOfStaffs;
		this.principalName = principalName;
		this.noOfStudents = noOfStudents;
		this.noOfBranches = noOfBranches;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals method in institute");

		if (obj instanceof Institution) {
			System.out.println("obj is institution, can check the properties");
			Institution casting = (Institution) obj;
			if (this.name.equals(casting.name)) {
				System.out.println("name is same");
				return true;
			} else {
				System.err.println("obj is not Institution, cannot check the properties");
			}

		}
		return false;
	}

	@Override
	public String toString() {
		return "Institution [name=" + name + ", location=" + location + ", type=" + type + ", fee=" + fee
				+ ", noOfStaffs=" + noOfStaffs + ", principalName=" + principalName + ", noOfStudents=" + noOfStudents
				+ ", noOfBranches=" + noOfBranches + "]";
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public String getType() {
		return type;
	}

	public double getFee() {
		return fee;
	}

	public int getNoOfStaffs() {
		return noOfStaffs;
	}

	public String getPrincipalName() {
		return principalName;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public int getNoOfBranches() {
		return noOfBranches;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public void setNoOfStaffs(int noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}

}
