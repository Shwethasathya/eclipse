package com.xworkz.inheritancec.boot;

import com.xworkz.inheritancec.child.Ravi;
import com.xworkz.inheritancec.thing.Criminal;

public class CriminalRunner {

	public static void main(String[] args) {
		
		System.out.println("displaying details of Criminal");
		Criminal crime = new Criminal("pick pocket", false, "Female");
		crime.display();

		System.out.println("displaying details of ravi");
		Ravi ravi = new Ravi("Murder", true, "male", 29);
		ravi.display();
	}

}
