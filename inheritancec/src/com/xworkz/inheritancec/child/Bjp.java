package com.xworkz.inheritancec.child;

import com.xworkz.inheritancec.thing.PoliticalParty;

public class Bjp extends PoliticalParty {

	public String expansion;

	public Bjp(String partyName, String symbol) {
		super(partyName, symbol);

	}

	public Bjp(String partyName, String symbol, String expansion) {
		super(partyName, symbol);
		this.expansion = expansion;
	}

	public void display() {
		System.out.println(this.expansion);
		super.display();
	}

}
