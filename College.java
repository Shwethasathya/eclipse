package com.xworkz.constance.code;

import com.xworkz.constance.cons.UniversityName;
public class College {

	public String collegeName;
	public UniversityName universityName = UniversityName.VTU;
	public String collegeCode;
	public String location;
	public int noOfStudents;

	
	public String[] departments;
	public String[] branches;
	public boolean[] playGroundAvailable;
	public String[] gamesPlayed;
	public String[] admittedThrough;
	
	
	public College(String collegeName,UniversityName universityName,String collegeCode,
			String location,int noOfStudents,String[] departments, String[] branches,boolean[] playGroundAvailable,
			String[] gamesPlayed, String[] admittedThrough)
	{
		this.collegeName=collegeName;
		this.universityName=universityName;
		this.collegeCode=collegeCode;
		this.location=location;
		this.noOfStudents=noOfStudents;
		this.departments=departments;
		this.branches=branches;
		this.playGroundAvailable=playGroundAvailable;
		this.gamesPlayed=gamesPlayed;
		this.admittedThrough=admittedThrough;
		
	}
	
	public void display()
	{
		System.out.println("printing details");
		
		System.out.println(this.collegeName);
		System.out.println(this.universityName);
		System.out.println(this.collegeCode);
		System.out.println(this.location);
		System.out.println(this.noOfStudents);
		
		System.out.println(System.lineSeparator());
		
		System.out.println("printing array details");
		
		for (int i = 0; i < departments.length; i++) {
			String depart = departments[i];
			System.out.println(depart);
		}
		for (int i = 0; i < branches.length; i++) {
			String ref = branches[i];
			System.out.println(ref);
		}
		for (int i = 0; i < playGroundAvailable.length; i++) {
			boolean ref1 = playGroundAvailable[i];
			System.out.println(ref1);
		}
		for (int i = 0; i < gamesPlayed.length; i++) {
			String ref2 = gamesPlayed[i];
			System.out.println(ref2);
		}
		for (int i = 0; i < admittedThrough.length; i++) {
			String ref3 = admittedThrough[i];
			System.out.println(ref3);
		}
	}
}
