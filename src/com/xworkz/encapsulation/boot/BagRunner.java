package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.thing.Bag;
import com.xworkz.encapsulation.thing.Bags;

public class BagRunner {
public static void main(String[] args) {
	Bag bag=new Bag();
	bag.getColor();
	Bags bags=new Bags();
	bags.useBags(bag);
}
}
