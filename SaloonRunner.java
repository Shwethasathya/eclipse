package com.xworkz.constance.boot;

import com.xworkz.constance.code.Saloon;

public class SaloonRunner {
	
	public static void main(String[] args) {
		Saloon saloon = new Saloon("Blossom");
		saloon.price=500;
		saloon.display();
	}

}
