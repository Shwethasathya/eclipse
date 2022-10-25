package com.xworkz.constance.boot;

import com.xworkz.constance.code.College;
import com.xworkz.constance.cons.UniversityName;

public class CollegeRunner {

	public static void main(String[] args) {
		
		 String[] departments = {"ISE","CSE","EEE","mechanical"};
		 String[] branches = {"kumarswamylayout","vijaynagar"};
		 boolean[] playGroundAvailable= {true,false};
		 String[] gamesPlayed= {"cricket","kabbadi","ruuning race"};
		 String[] admittedThrough= {"cet","management"};
		 
		 College college = new College("EWIT",UniversityName.VTU,"1EW","Bangalore",1500,departments,branches,playGroundAvailable,gamesPlayed,admittedThrough);
		 
		 college.display();
	}

}
