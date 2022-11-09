package com.xworkz.inheritancec.thing;

public class Criminal {
	public String offence;
	public boolean inJail;
	public String gender;

	public Criminal(String offence, boolean inJail, String gender) {
		super();
		this.offence = offence;
		this.inJail = inJail;
		this.gender = gender;
	}

	public void display()
	{
		System.out.println(this.offence);
		System.out.println(this.inJail);
		System.out.println(this.gender);
	}
}
