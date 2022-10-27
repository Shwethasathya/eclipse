package com.xworkz.association.thing;

public class God {

	public String name;
	public char gender;
	public String mainPower;
	public Weapon weapon = new Weapon("damaruga", "destroy and re-creat universe", 250);

	public God(String name, char gender, String mainPower) {
		super();
		this.name = name;
		this.gender = gender;
		this.mainPower = mainPower;
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(gender);
		System.out.println(mainPower);
		this.weapon.display();
	}

}
