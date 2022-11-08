package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.Bengaluru;
import com.xworkz.inheritance.thing.Capital;
import com.xworkz.inheritance.thing.City;
import com.xworkz.inheritance.thing.MetroCity;
import com.xworkz.inheritance.thing.Place;
import com.xworkz.inheritance.thing.SiliconCity;

public class BengaluruRunner {

	public static void main(String[] args) {
		
		Bengaluru bang=new Bengaluru();
		bang.bengaluru();
		
		Place place = new Capital();
		Object obj = new Capital();
		
		Capital capital = new Capital();
		Place place1 = new Capital();
		Object obj1 = new Capital();
		
		City city = new City();
		Capital capital1 = new City();
		Place place11 = new City();
		Object obj11 = new City();
		
		MetroCity metro = new MetroCity();
		City city1 = new MetroCity();
		Capital capital2 = new MetroCity();
		Place place2 = new MetroCity();
		Object obj2 = new MetroCity();
		
		SiliconCity silicon = new SiliconCity();
		City city2 = new SiliconCity();
		MetroCity metro1 = new SiliconCity();
		Capital capital3 = new SiliconCity();
		Place place3 = new SiliconCity();
		Object obj3= new SiliconCity();
		
		
		
	}
}
