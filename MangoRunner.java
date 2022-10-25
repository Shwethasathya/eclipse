package com.xworkz.constance.boot;

import com.xworkz.constance.code.Mango;

public class MangoRunner {

	public static void main(String[] args) {
		Mango fruit = new Mango("fresh fruit stall");
		fruit.setColor("orange");
		fruit.sweet = true;
		fruit.display();

	}

}
