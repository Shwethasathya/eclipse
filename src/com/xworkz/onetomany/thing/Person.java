package com.xworkz.onetomany.thing;

public class Person {
	public String name;
	public Email[] emails;
	public Job job = new Job(370000, "software engineer", 2);

	public Person(String name) {
		super();
		this.name = name;
	}

	public void setEmail(Email[] emails)
	{
		this.emails=emails;
		
	}
	public void display() {

		if(emails!=null)
		{
			for (int i = 0; i < emails.length; i++) {
				Email email = emails[i];
		
				if(email!=null)
				{
					email.display();
				}
			}
		}
		System.out.println("name of a person is : "+name);
		
		job.display();

	}
}
