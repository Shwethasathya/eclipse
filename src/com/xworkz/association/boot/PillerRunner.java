package com.xworkz.association.boot;

import com.xworkz.association.special.Shape;
import com.xworkz.association.thing.Piller;

public class PillerRunner {
	public static void main(String[] args) {
		Piller piller = new Piller(15, "Bangalore", Shape.CIRCULAR, 10.2f, "steel");
		piller.display();
	}
}
