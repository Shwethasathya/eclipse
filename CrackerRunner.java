package com.xworkz.constance.boot;

import com.xworkz.constance.code.Cracker;

public class CrackerRunner {

	public static void main(String[] args) {
		Cracker cracker = new Cracker("RR Crackers");
		cracker.setPrice(500);
		cracker.display();
		
	}
}
