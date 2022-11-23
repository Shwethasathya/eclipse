package com.xworkz.inheritancec.boot;

import com.xworkz.inheritancec.equals.Currency;

public class CurrencyRunner {

	public static void main(String[] args) {
		Currency currency = new Currency("doller", "US", 50, 'd', true, 81.71d, "paper",
				"Ecuador, El Salvador, Zimbabwe,..");

		Currency currency1 = new Currency("Rupees", "India", 17, 'r', true, 50, "paper", "bhutan,nepal,bangladesh,..");

		currency = currency1;
		boolean same = currency.equals(currency1);
		System.out.println(same);

	}

}