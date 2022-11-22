package com.xworkz.inheritancec.boot;

import com.xworkz.inheritancec.equals.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {
		WaterBottle bottle = new WaterBottle("Bisleri", "plastic", 25, 5.6f, 35, "yes", 1, true, "tupperware", false);

		WaterBottle bottle1 = new WaterBottle("thermosteel", "steel", 600, 4.2f, 600, "yes", 1, true, "steel", false);

		bottle = bottle1;
		boolean same = bottle.equals(bottle1);
		System.out.println(same);

	}

}
