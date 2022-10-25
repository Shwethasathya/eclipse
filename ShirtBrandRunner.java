package com.xworkz.constance.boot;

import com.xworkz.constance.code.ShirtBrand;

public class ShirtBrandRunner {

	public static void main(String[] args) {
		
		ShirtBrand shirt = new ShirtBrand(15000);
		shirt.available=true;
		shirt.display();
		
		
	}
}
