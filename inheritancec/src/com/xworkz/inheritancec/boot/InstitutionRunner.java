package com.xworkz.inheritancec.boot;

import com.xworkz.inheritancec.equals.Institution;

public class InstitutionRunner {

	public static void main(String[] args) {
		Institution institute = new Institution("EWIT", "Anjananagar", "private", 25000, 25, "chennakeshavalu", 1500,
				3);

		Institution institute1 = new Institution("X-workz", "Rajajinagar", "training", 28000, 7, null, 300, 2);

		institute = institute1;
		boolean same = institute.equals(institute1);
		System.out.println(same);
	}

}
