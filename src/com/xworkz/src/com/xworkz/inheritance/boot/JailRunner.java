package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.*;
import com.xworkz.inheritance.thing.Jail;

public class JailRunner {

	public static void main(String[] args) {

		Jail jail = new Jail();
		System.out.println(jail.location);
		System.out.println(jail.name);

		Jail jail1 = new CentralJail();
		CentralJail central = (CentralJail) jail1;
		System.out.println(central.location);
		System.out.println(central.noOfprisoners);

		Jail jail2 = new WomensJail();
		WomensJail womens = (WomensJail) jail2;
		System.out.println(womens.location);
		System.out.println(womens.noOfStaffs);

		Jail jail3 = new OpenJail();
		OpenJail open = (OpenJail) jail3;
		System.out.println(open.introducedBy);
		System.out.println(open.minimumSecurity);

	}
}
