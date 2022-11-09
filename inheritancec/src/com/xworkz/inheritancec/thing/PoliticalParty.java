package com.xworkz.inheritancec.thing;

public class PoliticalParty {

	public String partyName;
	public String symbol;

	public PoliticalParty(String partyName, String symbol) {
		super();
		this.partyName = partyName;
		this.symbol = symbol;
	}

	public void display() {
		System.out.println(this.partyName);
		System.out.println(this.symbol);

	}
}
