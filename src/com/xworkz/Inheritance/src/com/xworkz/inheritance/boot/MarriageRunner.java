package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.ArrangeMarriage;
import com.xworkz.inheritance.thing.Marriage;

public class MarriageRunner {

	public static void main(String[] args) {
		ArrangeMarriage marriage = new ArrangeMarriage("Bangalore", 1, "Priya");
		

		marriage.display();

	}

}
