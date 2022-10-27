package com.xworkz.association.thing;

public class Weapon {

	public String name;
	public String use;
	public float weigth;

	public Weapon(String name, String use, float weigth) {
		super();
		this.name = name;
		this.use = use;
		this.weigth = weigth;
	}
public void display()
{
	System.out.println(name);
	System.out.println(use);
	System.out.println(weigth);
}
}
