package com.xworkz.inheritancec.child;

import com.xworkz.inheritancec.thing.Jail;

public class Pg extends Jail {

	@Override
	public void food() {
		super.food();
		System.out.println("calling food from parent class");
	}
}
