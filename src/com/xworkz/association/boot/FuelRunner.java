package com.xworkz.association.boot;

import com.xworkz.association.special.Type;
import com.xworkz.association.thing.Fuel;
import com.xworkz.association.thing.Location;

public class FuelRunner {
	
	public static void main(String[] args) {
	
	Fuel fuel = new Fuel(true, Type.DIESEL, 105, 1);
	fuel.display();
	
}

}