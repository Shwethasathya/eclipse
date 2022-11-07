package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.*;
import com.xworkz.inheritance.thing.Doctor;

public class DoctorRunner {

	public static void main(String[] args) {

		Doctor doctor = new Doctor();

		System.out.println(doctor.specialisation);
		System.out.println(doctor.salary);

		Doctor doctor1 = new Dentist();

		Dentist dentist = (Dentist) doctor1;
		System.out.println(dentist.location);
		System.out.println(dentist.name);

		Doctor doc = new Ent();
		Ent ent = (Ent) doc;
		
		System.out.println(ent.phoneNo);
		System.out.println(ent.rating);

		Doctor doctor2 = new Cardiologist();
		Cardiologist cardio = (Cardiologist) doctor2;

		System.out.println(cardio.education);
		System.out.println(cardio.noOfStaffs);
	}

}
