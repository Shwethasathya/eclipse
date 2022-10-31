package com.xworkz.onetomany.thing;

public class Country {

	public String countryName;
	public int countryCode;
	public String primeMinister;
	public String currency;

	public Country(String countryName, int countryCode, String primeMinister, String currency) {
		super();
		this.countryName = countryName;
		this.countryCode = countryCode;
		this.primeMinister = primeMinister;
		this.currency = currency;
	}

	public void display()
	{
		System.out.println("displaying country");
		System.out.println(this.countryName);
		System.out.println(this.countryCode);
		System.out.println(this.primeMinister);
		System.out.println(this.currency);
		
	}
}
