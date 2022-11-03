package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.thing.Garden;
import com.xworkz.encapsulation.thing.Plant;

public class PlantRunner {

	public static void main(String[] args) {
		Plant plant=new Plant();
		System.out.println(plant.getPlantName());
		Garden garden=new Garden();
		garden.usePlant(plant);
	}

}
