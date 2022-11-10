package com.xworkz.inheritancec.child;

import com.xworkz.inheritancec.thing.WarJet;

public class Raffel extends WarJet {

	@Override
	public void combat()
	{
		System.out.println("calling combat from parent class");
		super.combat();
	}
}
