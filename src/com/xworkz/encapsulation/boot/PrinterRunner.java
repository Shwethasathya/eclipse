package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.thing.Print;
import com.xworkz.encapsulation.thing.Printer;

public class PrinterRunner {

	public static void main(String[] args) {
		Printer print=new Printer();
		print.getBrand();
		
		Print print1=new Print();
		print1.usePrinter(print);
	}

}
