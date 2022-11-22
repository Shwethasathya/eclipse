package com.xworkz.inheritancec.boot;

import com.xworkz.inheritancec.thing.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {
		Hospital hospital = new Hospital("Archana", "bangalore", "Archana", 1, 100, 1, 4, 9658742102l, 9,
				"www.doctorsarchana.com");

		Hospital hospital1 = new Hospital("BGS", "Bangalore", "Dr. K Ravindranath", 45, 600, 3, 4, 9862001241l, 24,
				"www.bgshospital.com");

		System.out.println(hospital);
		System.out.println(hospital1);
		hospital = hospital1;

		boolean same = hospital.equals(hospital1);
		System.out.println(same);
	}

}
