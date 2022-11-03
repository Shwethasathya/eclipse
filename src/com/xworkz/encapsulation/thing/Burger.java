package com.xworkz.encapsulation.thing;

public class Burger {

	public BurgerKing burger = new BurgerKing("veggie", "medium", "Round", 1956, true, 2, "Cheese,onion,..",
			"Miami-Dade");

	public void useBurgerKing(BurgerKing king) {
		System.out.println(king.getOwnerName());
		System.out.println("James McLamore, David Edgerton");
		System.out.println(king.flavour);
		System.out.println(king.founderYear);
		System.out.println(king.ingredients);
		System.out.println(king.quantity);
		System.out.println(king.shape);
		System.out.println(king.size);
		System.out.println(king.taste);
	}
}
