package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.thing.Chakra;
import com.xworkz.encapsulation.thing.Tyres;

public class TyreRunner {

	public static void main(String[] args) {
		
		Chakra chakra = new Chakra();
		Tyres tyre=new Tyres(null, 100, 5, 10, 25, 25, 2, 1060);
		
		System.out.println(chakra.name);
		System.out.println(chakra.tyre);
		System.out.println(tyre.getBrand());
		System.out.println(tyre.getColor());
		System.out.println(tyre.getTypeUsedFor());
		
	}

}
