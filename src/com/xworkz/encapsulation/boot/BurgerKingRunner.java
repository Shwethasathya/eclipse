package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.thing.BurgerKing;

public class BurgerKingRunner {
public static void main(String[] args) {
	
	
	BurgerKing burger = new BurgerKing("egg", "Small", "round", 1956, false, 0, "onion", null);
	System.out.println(burger.getFlavour());
	System.out.println(burger.getFounderYear());
	System.out.println(burger.getOwnerName());
	System.out.println(burger.getHeadQuartres());
	System.out.println(burger.getIngredients());
	System.out.println(burger.getQuantity());
	System.out.println(burger.getShape());
	System.out.println(burger.getSize());
}
}
