package com.xworkz.constance.boot;

import com.xworkz.constance.code.Milk;

public class MilkRunner {

	public static void main(String[] args) {
		Milk milk =new Milk(22);
		milk.expiryMonth=8;
		milk.quantity=2;
		milk.display();
		milk.totalPrice();
		
		
	}
}
