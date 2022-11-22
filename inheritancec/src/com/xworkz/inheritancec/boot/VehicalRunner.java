package com.xworkz.inheritancec.boot;

import com.xworkz.inheritancec.equals.Vehical;

public class VehicalRunner {

	public static void main(String[] args) {

		Vehical vehical = new Vehical("Car", 450000, "normal", true, "ford", 4, "KA 01 EG 8787", true, 5);

		Vehical vehical1 = new Vehical("ferrari", 600000, "sports car", false, "ferrari", 2, "KA 01 TH 9800", true, 3);

		vehical = vehical1;
		boolean same = vehical.equals(vehical1);
		System.out.println(same);
	}

}
