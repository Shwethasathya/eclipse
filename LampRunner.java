package com.xworkz.constance.boot;

import com.xworkz.constance.code.Lamp;

public class LampRunner {

	public static void main(String[] args) {
		Lamp lamp = new Lamp(100);
		lamp.setColors("blue");
		lamp.display();
		
	}
	

}
