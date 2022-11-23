package com.xworkz.inheritancec.boot;

import com.xworkz.inheritancec.equals.God;

public class GodRunner {

	public static void main(String[] args) {
		God god = new God("chamundeshwari", "Mysore", "trishula", null, 160.3, 100, 200,
				"generator operator destroyer");

		God god1 = new God("srinivasa", "tirupati", "shanku chakra", "abc", 247.1, 150, 1000,
				"generator operator destroyer");

		System.out.println(god);
		System.out.println(god1);
		boolean same = god.equals(god1);
		System.out.println(same);
	}

}
