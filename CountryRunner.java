package com.xworkz.association.boot;

import com.xworkz.association.special.Gender;
import com.xworkz.association.thing.City;
import com.xworkz.association.thing.Country;
import com.xworkz.association.thing.Name;
import com.xworkz.association.thing.President;

public class CountryRunner {

	public static void main(String[] args) {
		President president = new President("Narendra modi");
				president.setGender(Gender.MALE);
				
				Name name =new Name("Bengavaluru", "Bengalore", null);
				City citi = new City("Bangalore", false, 250);
				City city2=new City("Mysore", false, 0);
				
				City[] citys= {citi,city2};
				
				
	}

}