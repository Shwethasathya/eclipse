package com.xworkz.inheritancec.thing;

public class Director {
	public String name;
	public int age;

	public Director(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void display()
	{
	System.out.println(this.age);
	System.out.println(this.name);
	
	}
	}
