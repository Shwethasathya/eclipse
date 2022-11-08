package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Type;
import com.xworkz.inheritance.thing.Invitation;

public class InvitationRunner {

	public static void main(String[] args) {
		Invitation invite = new Invitation(Type.MARRIAGE, 150, "white");
		invite.display();
		
	}

}
