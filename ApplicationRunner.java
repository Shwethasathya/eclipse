package com.xworkz.constance.boot;

import com.xworkz.constance.code.Application;
import com.xworkz.constance.cons.Gender;



public class ApplicationRunner {

	public static void main(String[] args) {
		
		Application app = new Application("shwetha", "sathya", "sunandha", true, Gender.FEMALE, 98520032140L);
		
		app.display();
	}

}
