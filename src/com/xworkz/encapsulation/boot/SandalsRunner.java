package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.thing.SandalShop;
import com.xworkz.encapsulation.thing.Sandals;

public class SandalsRunner {

	public static void main(String[] args) {
		Sandals slipper=new Sandals();
		System.out.println(slipper.getBrand());
		SandalShop shop=new SandalShop();
		shop.useSandal(slipper);
		
	}

}
