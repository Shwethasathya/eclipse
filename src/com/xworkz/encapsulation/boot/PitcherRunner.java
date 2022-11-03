package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.thing.Photo;
import com.xworkz.encapsulation.thing.Pitcher;

public class PitcherRunner {

	public static void main(String[] args) {
		
		Pitcher cam=new Pitcher();
		cam.getBrand();
		
		Photo photo=new Photo();
		photo.Camera(cam);
	}

}
