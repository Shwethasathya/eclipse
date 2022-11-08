package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Menu;
import com.xworkz.inheritance.thing.Catering;

public class CateringRunner {

	public static void main(String[] args) {
		Catering catering = new Catering("Buffet", 450, Menu.BADHUSHA);
		catering.display();

	}

}
