package com.xworkz.inheritancec.child;

import com.xworkz.inheritancec.thing.PetrolBunk;

public class Venkateshwara extends PetrolBunk{
	
	@Override
	public void air()
	{
		super.air();
		System.out.println("calling air from parent class");
	}

}
