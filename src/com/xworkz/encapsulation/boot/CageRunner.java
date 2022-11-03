package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.thing.Cage;
import com.xworkz.encapsulation.thing.Cages;

public class CageRunner {
	public static void main(String[] args) {
		Cage cage = new Cage();
		System.out.println(cage.getMadeIn());

		Cages cag = new Cages();
		cag.useCage(cage);
	}
}
