package com.xworkz.constance.code;

import com.xworkz.constance.cons.Gender;

public class Application {

	public String name;
	public String fatherName;
	public String motherName;
	public boolean indian;
	public Gender gender = Gender.FEMALE;
	public long phoneNo;
	
	public Application(String name, String fatherName,String motherName, boolean indian, Gender gender, long phoneNo)
	{
		this.name=name;
		this.fatherName=fatherName;
		this.motherName=motherName;
		this.indian=indian;
		this.gender=gender;
		this.phoneNo=phoneNo;
		
	}
	
	public void display()
	{
		
		System.out.println(this.name);
		System.out.println(this.fatherName);
		System.out.println(this.motherName);
		System.out.println(this.indian);
		System.out.println(this.gender);
		System.out.println(this.phoneNo);
	
	}
}
