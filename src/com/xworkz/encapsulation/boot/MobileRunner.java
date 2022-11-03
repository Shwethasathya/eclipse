package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.thing.Mobile;
import com.xworkz.encapsulation.thing.Phone;

public class MobileRunner {

	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.getType();
		
		Phone phone=new Phone();
		phone.useMobile(mobile);
	}

}
