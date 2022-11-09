package com.xworkz.inheritancec.boot;

import com.xworkz.inheritancec.child.Moon;
import com.xworkz.inheritancec.thing.Satellite;

public class SatelliteRunner {
	public static void main(String[] args) {
		Moon moon = new Moon("Moon", "East", "Round");
		moon.display();
		
		Satellite sat=new Satellite("Chandrayana", "west");
		sat.display();
	}
}
