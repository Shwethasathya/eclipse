package com.xworkz.association.thing;

import com.xworkz.association.special.Gender;

public class President {
	public String name;
	public int tenure = 5;
	public Gender gender= Gender.MALE;

	public President(String name) {
		super();
		this.name = name;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void display() {
		System.out.println("Entered president");

		System.out.println(this.name);
		System.out.println(this.tenure);

		if (gender != null) {
			System.out.println(this.gender);
		} else {
			System.out.println("gender is null");
		}
	}
}
