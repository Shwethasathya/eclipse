package com.xworkz.onetomany.thing;

public class Email {

	public String id;
	public String password;
	public long mobileNo;
	public Company company = new Company("gmail", "sergey brin and larry page");

	public Email(String id, String password, long mobileNo) {
		super();
		this.id = id;
		this.password = password;
		this.mobileNo = mobileNo;
	}

	public void display() {
		System.out.println("displaying email details.....");
		System.out.println(id);
		System.out.println(password);
		System.out.println(mobileNo);

		
		company.display();
	}

}
