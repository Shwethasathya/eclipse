package com.xworkz.inheritancec.child;

import com.xworkz.inheritancec.thing.Terrorist;

public class Kasab extends Terrorist {

	@Override
	public void bombblast(){
		System.out.println("calling from parent class");
	super.bombblast();
	}
}
