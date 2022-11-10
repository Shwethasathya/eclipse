package com.xworkz.inheritancec.child;

import com.xworkz.inheritancec.thing.HumanResource;

public class Akshara extends HumanResource {

	@Override
	public void hire()
	{
		super.hire();
		System.out.println("hiring from human resource");
	}
}
