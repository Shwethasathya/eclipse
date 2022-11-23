package com.xworkz.inheritancec.boot;

import com.xworkz.inheritancec.equals.Lipstic;

public class LipsticRunner {

	public static void main(String[] args) {
		Lipstic lipstic = new Lipstic("sugar", 719.00, "pencil", "matte", 3, "pink", 1, "sugar cosmetic", "germany",
				4.5f);

		Lipstic lipstic1 = new Lipstic("lakme", 215, "liquid", "matte", 3, "marron", 1, "ancorotti cosmetics", "India",
				4);

		System.out.println(lipstic);
		System.out.println(lipstic1);
		boolean same = lipstic.equals(lipstic1);
		System.out.println(same);
	}

}
