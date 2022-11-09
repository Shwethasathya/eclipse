package com.xworkz.inheritancec.child;

import com.xworkz.inheritancec.thing.Criminal;

public class Ravi extends Criminal {

	public int age;

	public Ravi(String offence, boolean inJail, String gender, int age) {
		super(offence, inJail, gender);
		this.age = age;

	}

	public void display() {
		System.out.println(this.age);
		super.display();
	}
}
