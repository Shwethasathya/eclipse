package com.xworkz.onetomany.thing;

public class State {
	public String name;
	public String chiefMinister;
	public float literacy;
	public String region;

	public State(String name, String chiefMinister, float literacy) {
		super();
		this.name = name;
		this.chiefMinister = chiefMinister;
		this.literacy = literacy;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void display() {

		System.out.println(this.name);
		System.out.println(this.chiefMinister);
		System.out.println(this.literacy);
		System.out.println(this.region);
	}
}
