package com.xworkz.constance.boot;

import com.xworkz.constance.code.Flower;

public class FlowerRunner {

	public static void main(String[] args) {
		Flower flower=new Flower(5);
		flower.setPrice(200);
		flower.quantity=5;
		
		flower.display();
		
				

	}

}
