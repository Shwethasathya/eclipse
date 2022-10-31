package com.xworkz.onetomany.boot;

import com.xworkz.onetomany.thing.Email;
import com.xworkz.onetomany.thing.Person;

public class PersonRunner {

	public static void main(String[] args) {
		
		Email email = new Email("shwetha1415@gmail.com", "*******", 7611944094L);
		email.display();
		
		Email email1=new Email("shwethakumar284@gmail.com", "shwetha1234", 9741780961L);
		email1.display();
		
		Email[] emails= {email,email1};
		
		Person person = new Person("shwetha");
		
		person.setEmail(emails);
		
		person.display();
		
		
	}
}

