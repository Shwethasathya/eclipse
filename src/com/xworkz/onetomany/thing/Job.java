package com.xworkz.onetomany.thing;

public class Job {
	public double salary;
	public String role;
	public int bond;
	public Company company = new Company("first american","abc");

	public Job(double salary, String role, int bond) {
		super();
		this.salary = salary;
		this.role = role;
		this.bond = bond;
	}
public void display()
{
	System.out.println("details of job");
	System.out.println(this.salary);
	System.out.println(this.role);
	System.out.println(this.bond);
	company.display();
}
}
