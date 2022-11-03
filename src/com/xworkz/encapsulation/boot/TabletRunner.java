package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.thing.Medicine;
import com.xworkz.encapsulation.thing.Tablets;

public class TabletRunner {
public static void main(String[] args) {
	Tablets maatre=new Tablets();
	System.out.println(maatre.getName());
	System.out.println(maatre.getUsedFor());
	
	Medicine med=new Medicine();
	med.useTablet(maatre);
}
}
